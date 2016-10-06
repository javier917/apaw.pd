package calculadora_recuerdo;

import calculadora.AddCommand;
import calculadora.Calculator;
import calculadora.CommandManager;
import calculadora.PrintCommand;
import calculadora.ResetCommand;
import calculadora.SubtractCommand;
import upm.jbb.IO;

public class Main {
    private CommandManager commandManager;

    public Main() {
            Calculator calculator = new CalculadorMementable();
            GestorMementos gestorMementos=new GestorMementos();
            this.commandManager = new CommandManager();
            this.commandManager.add(new AddCommand(calculator));
            this.commandManager.add(new SubtractCommand(calculator));
            this.commandManager.add(new ResetCommand(calculator));
            this.commandManager.add(new PrintCommand(calculator));
            this.commandManager.add(new ComandoGuardar(calculator,gestorMementos));
            this.commandManager.add(new ComandoDeshacer(calculator,gestorMementos));
        }

    public void execute() {
        String key = (String) IO.getIO().select(this.commandManager.keys());
        this.commandManager.execute(key);
    }

    public static void main(String[] args) {
        IO.getIO().addView(new Main());
    }
}

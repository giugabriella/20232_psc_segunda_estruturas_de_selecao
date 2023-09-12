import javax.swing.JOptionPane;

public class ExemploIf{
    static public void main(String [] args){

        double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota "));

        if(nota>=70){
            JOptionPane.showMessageDialog(null, "Aprovado");
        }
    }
} 
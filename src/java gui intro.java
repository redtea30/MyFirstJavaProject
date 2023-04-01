import javax.swing.JOptionPane;

public class gui {
    public static void main(String[] args){
        //simple dialog
        String name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null, "Hello "+ name);

        //
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null,"you are "+age+" year's old");

        //
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));
        JOptionPane.showMessageDialog(null,"you are "+height+" cm");
    }





}

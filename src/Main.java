import javax.swing.*;
 
public class Main {
 
 public static void main(String[] args) {
 
 metodos x = new metodos();
 
 int op = 0;
 
 while(true){
 
 op = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU:\n\n1. Inclusão do telefone\n2. Exclusão de telefone\n3. Consultar por nome\n4. Sair\n\nDigite a opção:"));
 
 switch (op){
 
 case 1:
 x.cadastro();
 break;
 case 2:
 x.excluir();
 break;
 case 3:
 x.pesquisar();
 break;
 case 4:
 x.sair();
 break;
 default:
 JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!", "AVISO", 1);
 
 }
 
 }//fim do while
 }
 
}
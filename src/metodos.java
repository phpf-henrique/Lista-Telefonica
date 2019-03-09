import java.util.ArrayList;
import javax.swing.*;
public class metodos {
 static ArrayList<campos> dados = new ArrayList<campos>();
 static int acho;
 
 public static void cadastro() {
 
 int op = 1;
 String nome;
 int tel;
 
 while (op == 1) {
 
 nome = JOptionPane.showInputDialog(null, "Qual o nome do cliente?","Cadastro",3);
 do {
 acho = 0;
 tel = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o telefone do cliente?\n(Somente números)","Cadastro",3));
 //pesquisa o tel se o tamanho do array é diferente zero
 if (dados.size() > 0)
 for(int i=0 ;i < dados.size(); i++) {
 if(tel == dados.get(i).tel)
 acho = 1;
 }
 if(acho == 1)
 JOptionPane.showMessageDialog(null, "Telefone já cadastrado!","Aviso",1);
 }while(acho == 1);
 // fim do pesquisa
 dados.add(new campos(nome, tel));
 do {
 op = Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja efetuar outro cadastro?\n\n1. Sim\n2. Não\n\nDigite sua opção:"));
 } while(op != 1 && op !=2);
 
 }// fim do while op == 1
 
 }// fim do cadastro
 
 public static void alterar() {
 
 String nome;
 int tel;
 int posicao = 0;
 
 if (dados.size() > 0) {
 
 //altera tel
 tel = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o telefone da pessoa que deseja alterar os dados:\n(Somente números)"));
 
 acho = 0;
 for(int i=0 ;i < dados.size(); i++) {
 if(tel == dados.get(i).tel) {
 acho = 1;
 posicao = i;
 }
 }// fim da busca
 if(acho == 1) {
 nome = JOptionPane.showInputDialog(null, "Qual o nome do cliente?","Cadastro",3);
 do {
 acho = 0;
 tel = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o telefone do cliente?\n(Somente números)","Cadastro",3));
 //pesquisa o tel se o tamanho do array é diferente zero
 if (dados.size() > 0)
 for(int i=0 ;i < dados.size(); i++) {
 if(tel == dados.get(i).tel)
 acho = 1;
 }
 if(acho == 1)
 JOptionPane.showMessageDialog(null, "Telefone já cadastrado!","Aviso",1);
 }while(acho == 1);
 // fim do pesquisa
 
 dados.set(posicao, new campos(nome, tel));
 
 //fim altera
 }
 else
 JOptionPane.showMessageDialog(null, "Telefone não encontrado!","Aviso",1);
 } else {
 JOptionPane.showMessageDialog(null, "Ainda nenhum cadastro foi realizado!","Aviso",1);
 }
 }// fim funcao alterar
 
 static void excluir(){
 
 int tel, posicao = 0;
 
 if (dados.size() > 0) {
 tel = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o telefone da pessoa que deseja excluir os dados:\n(Somente números)"));
 for(int i=0 ;i < dados.size(); i++)
 if(tel == dados.get(i).tel) {
 acho = 1;
 posicao = i;
 }
 
 if (acho==1){
 
 int conf;
 conf = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir?");
 
 if(conf == 0) {
 dados.remove(posicao);
 JOptionPane.showMessageDialog(null, "Telefone excluído", "Aviso", 1);
 }
 
 }else
 JOptionPane.showMessageDialog(null, "Telefone não encontrado!","Aviso",1);
 }
 else{
 JOptionPane.showMessageDialog(null, "Ainda nenhum cadastro foi realizado!","Aviso",1);
 }
 
 }//fim da exlusao
 
 static void pesquisar() {
 
 String nome;
 
 if (dados.size() > 0) {
 nome = JOptionPane.showInputDialog(null, "Digite o nome da pessoa que deseja pesquisar os dados:");
 for(int i=0 ;i < dados.size(); i++)
 if(nome.equals(dados.get(i).nome)) {
 
 acho = 1;
 
 JOptionPane.showMessageDialog(null, "REGISTRO ENCONTRADO:\n\nNome: " + dados.get(i).nome + "\nTelefone: " + dados.get(i).tel,"Resultado", 1);
 }
 
 if (acho==0){
 JOptionPane.showMessageDialog(null, "Nenhum registro foi encontrado!","Aviso",1);
 }
 }
 else{
 JOptionPane.showMessageDialog(null, "Ainda nenhum cadastro foi realizado!","Aviso",1);
 }
 
 }//fim pesquisar
 
 static void sair(){
 
 JOptionPane.showMessageDialog(null, "Finalizado","Aviso",1);
 System.exit(0);
 }
 }
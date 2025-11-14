import java.util.Scanner;

public class PrincipalClasse{
	
	public static void limparTela() {
	    try {
	        if (System.getProperty("os.name").contains("Windows")) {
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        } else {
	            System.out.print("\033[H\033[2J");
	            System.out.flush();
	        }
	    }catch (Exception e) {
            System.out.println("Erro ao limpar tela.");
        }
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
		do{
			
			limparTela();
			System.out.println("MENU DE OPÇÃO");
			System.out.println("[1] Adicionar um aluno");
			System.out.println("[2] Excluir um aluno");
			System.out.println("[3] ver alunos");
			System.out.println("[4] SAIR");
			
			opcao = sc.nextInt();
			sc.nextLine();
			
			limparTela();
			
		} while(opcao !=4);
	}
}
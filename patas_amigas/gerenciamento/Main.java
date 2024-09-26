package patas_amigas.gerenciamento;
import patas_amigas.atores.Pessoa;
import patas_amigas.atores.Funcionario;
import patas_amigas.atores.Tutor; 
import patas_amigas.atores.Adotante;
import java.util.ArrayList;
import java.util.Scanner; 

public class Main {
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        //funcionario, tutor, adotante, animal.
        //aí, pra cada um: criar o objeto
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        System.out.println("Bem-vindo ao Patas Amigas ");
        boolean condicao = true; 

        while(condicao){
            
            System.out.println("\nEscolha qual deseja gerenciar: ");
            System.out.println("1.Funcionário");
            System.out.println("2.Tutor");
            System.out.println("3.Adotante");
            System.out.println("4. Saída");
            int op = scan.nextInt();

            switch (op){
                case 1: 
                    pessoas.add(gerenciarFuncionario());
                    break; 
                case 2: 
                    pessoas.add(gerenciarTutor());
                    break; 
                case 3: 
                    //pessoas.add(gerenciarAdotante());
                    break;
                case 4: 
                    condicao = false; 
                    break; 
                default: 
                    System.out.println("Opção inválida! Tente novamente");
            }
        }
    }

    //apenas cadastro, ou seja, apenas criação, mas vamos deixar as opções
    public static Pessoa gerenciarFuncionario(){

        System.out.println("Escolha uma opção: ");
        System.out.println("1.Criar novo funcionário");
        System.out.println("2.Exibir informações do funcionário");
        System.out.println("3.Editar informações do funcionário");
        int op = scan.nextInt();
        
        switch(op){
            case 1:
            System.out.println("Digite seu nome completo: ");
            String nome = scan.nextLine();

            System.out.println("Digite seu CPF: ");
            String cpf = scan.nextLine();

            System.out.println("Digite sua data de nascimento: ");
            String dataNasc = scan.nextLine();

            System.out.println("Digite seu email: ");
            String email = scan.nextLine();

            System.out.println("Digite sua senha: ");
            String senha = scan.nextLine();

            System.out.println("Digite seu telefone: ");
            String tel = scan.nextLine();

            System.out.println("Digite seu endereço: ");
            String endereco = scan.nextLine();

            System.out.println("Digite seu gênero: ");
            String genero = scan.nextLine();

            System.out.println("Digite sua data de contratação: ");
            String dataContratacao = scan.nextLine();

            System.out.println("Digite seu cargo: ");
            String cargo = scan.nextLine(); 

            System.out.println("Digite seu salário: ");
            double salario = scan.nextDouble();

            System.out.println("Digite seu departamento: ");
            String departamento = scan.nextLine();
            
            Funcionario funcionario = new Funcionario(nome,cpf,dataNasc,email,senha,endereco,tel,genero,true,dataContratacao,cargo,salario,departamento); 
           
            System.out.println("Funcionario criado com sucesso!");
            System.out.println(  funcionario.toString());
          
            return (Pessoa) funcionario;
        }
    }
    
    public static Pessoa gerenciarTutor(){

        System.out.println("Escolha uma opção: ");
        System.out.println("1.Criar novo tutor");
        System.out.println("2.Exibir informações do tutor");
        System.out.println("3.Editar informações do tutor");
        int op = scan.nextInt();

        switch (op){
            case 1: 
            System.out.println("Digite seu nome completo: ");
            String nome = scan.nextLine();

            System.out.println("Digite seu CPF: ");
            String cpf = scan.nextLine();

            System.out.println("Digite sua data de nascimento: ");
            String dataNasc = scan.nextLine();

            System.out.println("Digite seu email: ");
            String email = scan.nextLine();

            System.out.println("Digite sua senha: ");
            String senha = scan.nextLine();

            System.out.println("Digite seu telefone: ");
            String tel = scan.nextLine();

            System.out.println("Digite seu endereço: ");
            String endereco = scan.nextLine();

            System.out.println("Digite seu gênero: ");
            String genero = scan.nextLine();

            System.out.println("Digite a quantidade de animas mantidas sob custódia: ");
            int numAnimais_custodia = scan.nextInt();

            //criando variável, pois ainda não temos a lista do histórico de adoções.
            ArrayList <Object> historicoAdocoes_tutor = new ArrayList<>();

            Tutor tutor = new Tutor(nome,cpf,dataNasc,email,senha,endereco,tel,genero,true, numAnimais_custodia, historicoAdocoes_tutor);
            
            return (Pessoa)tutor;
        }
    }
    
    public static Pessoa gerenciarAdotante(){
        System.out.println("Escolha uma opção: ");
        System.out.println("1.Criar novo adotante");
        System.out.println("2.Exibir informações do adotante");
        System.out.println("3.Editar informações do adotante");
        int op = scan.nextInt();

        switch(op){
            case 1:
            System.out.println("Digite seu nome completo: ");
            String nome = scan.nextLine();

            System.out.println("Digite seu CPF: ");
            String cpf = scan.nextLine();

            System.out.println("Digite sua data de nascimento: ");
            String dataNasc = scan.nextLine();

            System.out.println("Digite seu email: ");
            String email = scan.nextLine();

            System.out.println("Digite sua senha: ");
            String senha = scan.nextLine();

            System.out.println("Digite seu telefone: ");
            String tel = scan.nextLine();

            System.out.println("Digite seu endereço: ");
            String endereco = scan.nextLine();

            System.out.println("Digite seu gênero: ");
            String genero = scan.nextLine();

            System.out.println("Digite sua preferência para adoção:");
            String preferencia = scan.nextLine();

         //criando variável, pois ainda não temos a lista do histórico de adoções.
         ArrayList <Object> historicoAdocoes_adotante = new ArrayList<>();

         Adotante adotante = new Adotante((nome,cpf,dataNasc,email,senha,endereco,tel,genero,true,preferencia, historicoAdocoes_adotante);

         return adotante;

        }
    }
}

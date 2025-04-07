import java.util.Scanner;


public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente pet = new Cliente();

        System.out.println("Digite o seu nome:");
        pet.nome = sc.nextLine();

        System.out.println("Digite o seu email:");
        pet.email = sc.nextLine();

        System.out.println("Digite seu telefone:");
        pet.telefone = sc.nextLine();

        System.out.println("Digite o seu CNPJ:");
        pet.cnpj = sc.nextLine();


System.out.println("=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=");

System.out.println("=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=");

Endereco endereco = new Endereco();
        System.out.println("Digite o seu endereço:");
        endereco.rua = sc.nextLine();

        System.out.println("Digite o seu número:");
        endereco.num = sc.nextLine();

        System.out.println("Digite o seu bairro:");
        endereco.bairro = sc.nextLine();

System.out.println("/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=");

System.out.println("/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=");
        Responsavel responsavel = new Responsavel();
        responsavel.nome = sc.nextLine();
     
        responsavel.email = sc.nextLine();
    
        responsavel.telefone = sc.nextLine();
 
        // responsavel.endereco = sc.nextLine();

System.out.println("//////////////////////////////");
        Vacina vacina = new Vacina();
        System.out.println("Digite o nome da vacina:");
        vacina.nomeVacina = sc.nextLine();

        System.out.println("Digite a data da vacina:");
        vacina.dataVacina = sc.nextLine();

        System.out.println("Digite a idade da vacina:");
        vacina.idadeVacina = sc.nextLine();
System.out.println("/////////////////////////////////");

        Agenda agenda = new Agenda();
        
        agenda.tosa = sc.nextLine();
        agenda.banho = sc.nextLine();
        agenda.checkUp = sc.nextLine();
        agenda.consultaMarcada = sc.nextLine();
System.out.println("////////////////////////////////////");

        MeuPet meupet = new MeuPet();
        meupet.nome  = sc.nextLine();
        meupet.idade = sc.nextLine();
        meupet.raca = sc.nextLine();
        meupet.fotoPet = sc.nextLine();
        meupet.porte = sc.nextLine();
        meupet.sexo = sc.nextLine();

        sc.close();

    }
}

//Ythalo Andrey n°10
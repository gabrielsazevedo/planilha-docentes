import java.util.*;

public class Menu {

    private static int numeroDaOpcao;

    private static Scanner scan = new Scanner(System.in);

    public static void executarMenu() {

        do {

            System.out.println("\n ---SELECIONE UMA OPÇÃO--- \n 1 - Incluir disciplinas \n 2 - Inclusão de professores"
                    + "\n 3 - Listagem de disciplinas \n 4 - Listagem de professores e suas respectivas disciplinas \n 9 - Sair \n");

            numeroDaOpcao = obterNumeroDaOpcao();

            switch (numeroDaOpcao) {

                case 1:
                    Disciplina.incluirDisciplina();
                    break;

                case 2:
                    Professor.incluirProfessor();
                    break;

                case 3:
                    Disciplina.listarDisciplinas();
                    break;

                case 4:
                    Professor.listarProf_disciplinas();
                    break;

            }

        } while (numeroDaOpcao != 9);

    }

    public static int obterNumeroDaOpcao() {

        return scan.nextInt();

    }

}
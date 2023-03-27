import java.util.*;

public class Professor {

    private String matricula;
    private String nome;
    private Disciplina disciplina;
    private List<String> telefones = new ArrayList<>();
    private List<Disciplina> disciplinasProf = new ArrayList<>();
    private static List<Professor> professores = new ArrayList<>();

    private static Scanner scan = new Scanner(System.in);

    // Professor professor = new Professor();
    
    Professor professor = new Professor();

    public void incluirProfessor() {

        System.out.print("Informe a matrícula do professor: ");
        professor.setMatricula(scan.nextLine());

        System.out.print("Informe o nome do professor: ");
        professor.setNome(scan.nextLine());

        incluirTelefonesProf();

        System.out.print("Informe a quantidade de disciplinas do professor: ");
        int qtDisciplinas = scan.nextInt();

        scan.nextLine();

        if (qtDisciplinas > 0) {

            System.out.println("Informe a(s) disciplina(s) do professor \n");

            for (int j = 0; j < qtDisciplinas; j++) {

                professor.setDisciplina(Disciplina.incluirDisciplina());
                // System.out.println(disciplina.getDisciplinas().get(0));

                professor.getDisciplinasProf().add(professor.disciplina);

            }

            professores.add(professor);

        }

        else {

            System.exit(0);

        }
    }

    public void incluirTelefonesProf() {

        System.out.print("Informe a quantidade de telefones do professor: ");
        int qtTelefones = scan.nextInt();

        scan.nextLine();

        if (qtTelefones > 0) {

            System.out.print("Informe o(s) telefone(s) do professor: ");

            for (int i = 0; i < qtTelefones; i++) {

                professor.getTelefones().add(scan.nextLine());

            }
        }

        else {

            System.exit(0);

        }
    }

    public static void listarProf_disciplinas() {

        for (Professor professor : professores) {

            System.out.println("Matrícula: " + professor.getMatricula());
            System.out.println("Nome: " + professor.getNome());
            System.out.println("Telefone(s): " + professor.getTelefones());
            System.out.println("Disciplinas: ");

            for (Disciplina disciplina : professor.getDisciplinasProf()) {

                System.out.println(disciplina.getCodigo() + ("\n") + disciplina.getSemestre() + ("º semestre") +
                        ("\n") + disciplina.getNome() + ("\n"));

            }
        }

    }

    public Professor() {
    }

    public String getNome() {

        return nome;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public String getMatricula() {

        return matricula;

    }

    public void setMatricula(String matricula) {

        this.matricula = matricula;

    }

    public Disciplina getDisciplina() {

        return disciplina;

    }

    public void setDisciplina(Disciplina disciplina) {

        this.disciplina = disciplina;

    }

    public List<String> getTelefones() {

        return telefones;

    }

    public static List<Professor> getProfessores() {
        return professores;
    }

    public List<Disciplina> getDisciplinasProf() {
        return disciplinasProf;
    }

}

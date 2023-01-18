import java.util.*;

public class Disciplina {

    private String codigo;
    private int semestre;
    private String nome;
    private static List<Disciplina> disciplinas = new ArrayList<>();

    private static Scanner scan = new Scanner(System.in);

    public static Disciplina incluirDisciplina() {

        Disciplina disciplina = new Disciplina();

        System.out.print("Informe o código da disciplina: ");
        disciplina.setCodigo(scan.nextLine());

        System.out.print("Informe o semestre da disciplina: (em numeral) ");
        disciplina.setSemestre(scan.nextInt());

        scan.nextLine();

        System.out.print("Informe o nome da disciplina: ");
        disciplina.setNome(scan.nextLine());

        disciplinas.add(disciplina);

        return disciplina;

    }

    public static void listarDisciplinas() {

        for (Disciplina disciplina : disciplinas) {

            System.out.println(disciplina.getCodigo() + ("\n") + disciplina.getSemestre() + ("º semestre") +
                    ("\n") + disciplina.getNome() + ("\n"));
        }

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static List<Disciplina> getDisciplinas() {

        return disciplinas;

    }

}
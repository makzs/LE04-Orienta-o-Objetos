package br.edu.up.Controllers;

import br.edu.up.Models.Aluno;
import br.edu.up.Models.Competencia;
import br.edu.up.Models.Disciplina;
import br.edu.up.Models.Professor;

public class EscolaController {

    private Aluno[] criarAlunosMedicina(){
        Aluno[] alunos = new Aluno[6];

        Aluno aluno1 = new Aluno("1231", "matheus", "001", "medicina", "noturno", 2020);
        Aluno aluno2 = new Aluno("1232", "maria", "002", "medicina", "matutino", 2020);
        Aluno aluno3 = new Aluno("1233", "lucas", "003", "medicina", "noturno", 2020);
        Aluno aluno4 = new Aluno("1234", "marcia", "004", "medicina", "noturno", 2021);
        Aluno aluno5 = new Aluno("1235", "falvio", "005", "medicina", "matutino", 2022);
        Aluno aluno6 = new Aluno("1236", "pedro", "006", "medicina", "noturno", 2022);

        alunos[0] = aluno1;
        alunos[1] = aluno2;
        alunos[2] = aluno3;
        alunos[3] = aluno4;
        alunos[4] = aluno5;
        alunos[5] = aluno6;

        return alunos;
    }

    private Aluno[] criarAlunosEngenharia(){
        Aluno[] alunos = new Aluno[6];

        Aluno aluno1 = new Aluno("12311", "lucio", "001", "engenharia", "noturno", 2020);
        Aluno aluno2 = new Aluno("12322", "marina", "002", "engenharia", "matutino", 2020);
        Aluno aluno3 = new Aluno("12333", "miguel", "003", "engenharia", "noturno", 2020);
        Aluno aluno4 = new Aluno("12344", "luiza", "004", "engenharia", "noturno", 2021);
        Aluno aluno5 = new Aluno("12355", "flavia", "005", "engenharia", "matutino", 2022);
        Aluno aluno6 = new Aluno("12366", "ronaldo", "006", "engenharia", "noturno", 2022);

        alunos[0] = aluno1;
        alunos[1] = aluno2;
        alunos[2] = aluno3;
        alunos[3] = aluno4;
        alunos[4] = aluno5;
        alunos[5] = aluno6;

        return alunos;
    }

    private Professor[] criarProfessoresPadrao(){
        Professor[] professores = new Professor[3];

        Professor professor1 = new Professor("3211", "Jorge", "3211", "001", "Doutor", "UFSP", "TCC Medicina", 1994);
        Professor professor2 = new Professor("3212", "Antonio", "3212", "002", "Mestre", "UP", "TCC engenharia civil", 2001);
        Professor professor3 = new Professor("3213", "Vanessa", "3213", "003", "Doutora", "UFPR", "TCC odontologia", 1997);

        professores[0] = professor1;
        professores[1] = professor2;
        professores[2] = professor3;
        

        return professores;
    }

    public void inicializarPadroes(){
        Professor[] professores = criarProfessoresPadrao();
        
        // curso medicina
        Aluno[] alunosMedicina = criarAlunosMedicina();
        Disciplina[] disciplinasMedicina = new Disciplina[3];

        // disciplina 1
        Competencia[] competenciaMedicinaInicial = new Competencia[5];

        Competencia competenciaMI1 = new Competencia("cardiologia", true);
        Competencia competenciaMI2 = new Competencia("anatomia", true);
        Competencia competenciaMI3 = new Competencia("sistemas do corpo humano", true);
        Competencia competenciaMI4 = new Competencia("boas praticas", false);
        Competencia competenciaMI5 = new Competencia("pesquisa", false);

        competenciaMedicinaInicial[0] = competenciaMI1;
        competenciaMedicinaInicial[1] = competenciaMI2;
        competenciaMedicinaInicial[2] = competenciaMI3;
        competenciaMedicinaInicial[3] = competenciaMI4;
        competenciaMedicinaInicial[4] = competenciaMI5;

        Disciplina medicinaInicial = new Disciplina("001", "medicinaInicial", "medicina", competenciaMedicinaInicial, professores[0], alunosMedicina);

        // disciplina 2
        Competencia[] competenciaMedicinaIntermediaria = new Competencia[5];

        Competencia competenciaMIT1 = new Competencia("Cirurgia", true);
        Competencia competenciaMIT2 = new Competencia("Neurologia", true);
        Competencia competenciaMIT3 = new Competencia("Medicamentos", true);
        Competencia competenciaMIT4 = new Competencia("quimica", false);
        Competencia competenciaMIT5 = new Competencia("fisioterapia", false);

        competenciaMedicinaIntermediaria[0] = competenciaMIT1;
        competenciaMedicinaIntermediaria[1] = competenciaMIT2;
        competenciaMedicinaIntermediaria[2] = competenciaMIT3;
        competenciaMedicinaIntermediaria[3] = competenciaMIT4;
        competenciaMedicinaIntermediaria[4] = competenciaMIT5;

        Disciplina medicinaIntermediaria = new Disciplina("002", "medicinaIntermediaria", "medicina", competenciaMedicinaIntermediaria, professores[0], alunosMedicina);

        //disciplina 3
        Competencia[] competenciaMedicinaAvançada = new Competencia[5];

        Competencia competenciaMA1 = new Competencia("Estudo do Sangue", true);
        Competencia competenciaMA2 = new Competencia("Estudo dos Hormonios", true);
        Competencia competenciaMA3 = new Competencia("dermatologia", true);
        Competencia competenciaMA4 = new Competencia("nutrição", false);
        Competencia competenciaMA5 = new Competencia("biologia", false);

        competenciaMedicinaAvançada[0] = competenciaMA1;
        competenciaMedicinaAvançada[1] = competenciaMA2;
        competenciaMedicinaAvançada[2] = competenciaMA3;
        competenciaMedicinaAvançada[3] = competenciaMA4;
        competenciaMedicinaAvançada[4] = competenciaMA5;

        Disciplina medicinaAvançada = new Disciplina("003", "medicinaAvançada", "medicina", competenciaMedicinaAvançada, professores[0], alunosMedicina);

        // adiciona disciplinas no curso
        disciplinasMedicina[0] = medicinaInicial;
        disciplinasMedicina[1] = medicinaIntermediaria;
        disciplinasMedicina[2] = medicinaAvançada;


        // Curso Engenharia
        Aluno[] alunosEngenharia = criarAlunosEngenharia();
        Disciplina[] disciplinasEngenharia = new Disciplina[3];

        // Disciplina 1
        Competencia[] competenciaEngenhariaInicial = new Competencia[5];

        Competencia competenciaEI1 = new Competencia("Calculo", true);
        Competencia competenciaEI2 = new Competencia("Estrutura", true);
        Competencia competenciaEI3 = new Competencia("Fisica", true);
        Competencia competenciaEI4 = new Competencia("boas praticas", false);
        Competencia competenciaEI5 = new Competencia("pesquisa", false);

        competenciaEngenhariaInicial[0] = competenciaEI1;
        competenciaEngenhariaInicial[1] = competenciaEI2;
        competenciaEngenhariaInicial[2] = competenciaEI3;
        competenciaEngenhariaInicial[3] = competenciaEI4;
        competenciaEngenhariaInicial[4] = competenciaEI5;

        Disciplina engenhariaInicial = new Disciplina("004", "EngenhariaInicial", "Engenharia", competenciaEngenhariaInicial, professores[1], alunosEngenharia);


        // Disciplina 2
        Competencia[] competenciaEngenhariaIntermediaria = new Competencia[5];

        Competencia competenciaEIT1 = new Competencia("Calculo 2", true);
        Competencia competenciaEIT2 = new Competencia("Construção", true);
        Competencia competenciaEIT3 = new Competencia("Gestao de riscos", true);
        Competencia competenciaEIT4 = new Competencia("historia da engenharia", false);
        Competencia competenciaEIT5 = new Competencia("Gestao de recursos", false);

        competenciaEngenhariaIntermediaria[0] = competenciaEIT1;
        competenciaEngenhariaIntermediaria[1] = competenciaEIT2;
        competenciaEngenhariaIntermediaria[2] = competenciaEIT3;
        competenciaEngenhariaIntermediaria[3] = competenciaEIT4;
        competenciaEngenhariaIntermediaria[4] = competenciaEIT5;

        Disciplina engenhariaIntermediraria = new Disciplina("005", "EngenhariaIntermediaria", "Engenharia", competenciaEngenhariaIntermediaria, professores[1], alunosEngenharia);


        // Disciplina 3
        Competencia[] competenciaEngenhariaAvançada = new Competencia[5];

        Competencia competenciaEA1 = new Competencia("Calculo 3", true);
        Competencia competenciaEA2 = new Competencia("Materiais", true);
        Competencia competenciaEA3 = new Competencia("Engrenagens", true);
        Competencia competenciaEA4 = new Competencia("fisica 2", false);
        Competencia competenciaEA5 = new Competencia("Gestao de materiais", false);

        competenciaEngenhariaAvançada[0] = competenciaEA1;
        competenciaEngenhariaAvançada[1] = competenciaEA2;
        competenciaEngenhariaAvançada[2] = competenciaEA3;
        competenciaEngenhariaAvançada[3] = competenciaEA4;
        competenciaEngenhariaAvançada[4] = competenciaEA5;

        Disciplina engenhariaAvançada = new Disciplina("006", "EngenhariaAvançada", "Engenharia", competenciaEngenhariaAvançada, professores[1], alunosEngenharia);

        // adiciona disciplinas no curso
        disciplinasEngenharia[0] = engenhariaInicial;
        disciplinasEngenharia[1] = engenhariaIntermediraria;
        disciplinasEngenharia[2] = engenhariaAvançada;
    }

}

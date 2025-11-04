/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainassociazione;

/**
 *
 * @author bernicchi.davide
 */
public class MainAssociazione {
    public static void main(String[] args) {
        Docente docente1 = new Docente("Stefano", "Informatica");
        Aula aula1 = new Aula("LAB-01", 28);
        Aula aula2 = new Aula("AULA-12", 22);

        // Associazione bidirezionale
        docente1.assegnaAula(aula1); 
        System.out.println(docente1);   //Docente{nome='Stefano', materia='Informatica', aula=LAB-01}
        System.out.println(aula1);      //Aula{codice='LAB-01', posti=28, docente=Stefano}

        // Cambio aula
        docente1.assegnaAula(aula2);
        System.out.println(docente1);   //Docente{nome='Stefano', materia='Informatica', aula=AULA-12}
        System.out.println(aula1);      //Aula{codice='LAB-01', posti=28, docente=null}
        System.out.println(aula2);      //Aula{codice='AULA-12', posti=22, docente=Stefano}

        // Rimozione
        docente1.rimuoviAula();
        System.out.println(docente1);   //Docente{nome='Stefano', materia='Informatica', aula=null}
        System.out.println(aula1);      //Aula{codice='LAB-01', posti=28, docente=null}
        System.out.println(aula2);      //Aula{codice='AULA-12', posti=22, docente=null}    
    }
}

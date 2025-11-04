/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainassociazione;

/**
 *
 * @author bernicchi.davide
 */
class Docente {
    String name;
    String subject;
    Aula aula;
    String nameAula;
    
    
    Docente(String n, String s){
        set_name(n);
        set_subject(s);
    }
    
    void set_name(String n){
        name = n;
    }
    void set_subject(String s){
        subject=s;
    }

    public String get_nome(){
        return name;
    }
    void assegnaAula(Aula au) {
        if (aula != null){
            aula.remove_docente();
        }
        aula = au;
        nameAula = au.get_name();
        aula.add_docente(name);
    }

    void rimuoviAula() {;
        aula.remove_docente();
        aula=null;
        nameAula=null;
    }
    
   @Override
    public String toString(){
        return  "Docente{ nome: '"+name+"', materia: '" + subject + "', Aula: " +nameAula + "}";
        
    }
}

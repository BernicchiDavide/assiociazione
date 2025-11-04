/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainassociazione;

/**
 *
 * @author bernicchi.davide
 */
class Aula {
    String name;
    String nomeDocente=null;
    int nPosti;
    
    Aula(String lab, int n_stu){
        set_lab(lab);
        set_nPosti(n_stu);
    }
    void set_lab(String l){
        name=l;
    }
    void set_nPosti(int n_stu){
        nPosti = n_stu;
    }
    void add_docente(String nameDoc){
        nomeDocente= nameDoc;
    }
    void remove_docente(){
        nomeDocente=null;
    }

    String get_name() {
        return name;
    }
    
   @Override
    public String toString(){
        return "Aula { codice: '" + name+ "', posti:" + nPosti+", docente: " +nomeDocente+"}";
    }
}

package EX14;

/*
Agenda - classe que permite instanciar objectos que representam uma agenda, que
são constituídos por uma lista de contactos.
*/
public class Agenda {
   private String nome;
   private  Contacto[] contactos;

   public Agenda(String nome, int tamanho){
      this.nome = nome;
      contactos = new Contacto[tamanho];
   }

    public Agenda(){
        this.nome = "Agenda Pessoal";
        contactos = new Contacto[10];
    }

   public void addContacto(String nome, int telefone){
      for(int i = 0; i < contactos.length; i++){
         if(contactos[i] == null){
            contactos[i] = new Contacto(nome, telefone);
            break;
         }
      }
   }
   public void imprime(){
        System.out.println("Agenda: " + nome);
        for(int i = 0; i < contactos.length; i++){
             if(contactos[i] != null){
                System.out.println("Nome: " + contactos[i].getNome() + ", Telefone: " + contactos[i].getTelefone());
             }
        }
   }
}

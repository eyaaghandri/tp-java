public class laboratoire {

    public  address a ;
    public String nom;
    public String specialite;
    public bureau b[];
    public laboratoire(){}
    public laboratoire (String specialite,String nom,bureau b[],address a){
        this.specialite=specialite;
        this.nom=nom;
        this.b=new bureau [5];
        this.b=b;
        this.a=a;
    }
    public void affiche(){
        System.out.println("le nom est:"+this.nom+"specialite  est:"+this.specialite);
        int i;
        for (i=0;i<b.length;i++) {
            this.b[i].affiche_bureau();
        }
    }

    public String toString(){
        String result="nom"+nom+"specialite"+specialite+"adress"+a;
        int i;
        for (i=0;i<b.length;i++) {
            result += this.b[i];
        }
        return result;
    }
}




/**
 * @author N'ZO LAGOU
 * 
 * Exercice 3 : Surcharge Constructeur
Instructions
Créez une classe appelée "Student" avec les propriétés suivantes :

nom (chaîne)
âge (entier)
cours (chaîne)
grade (char)
Créez un constructeur par défaut qui initialise toutes les propriétés aux valeurs par défaut.

Créez un constructeur paramétré qui prend des valeurs pour les propriétés name et age et utilise le thismot-clé " " pour appeler le constructeur par défaut et définir les valeurs des propriétés restantes.

Créez un autre constructeur paramétré qui prend des valeurs pour toutes les propriétés.

Créez une méthode appelée " displayStudentInfo" qui imprime les valeurs de toutes les propriétés au format suivant : " Name: <name>, Age: <age>, Course: <course>, Grade: <grade>"

Dans la méthode principale, créez un objet de la classe Student à l'aide de chacun des constructeurs et appelez la displayStudentInfométhode " " pour afficher les valeurs de propriété de chaque objet.
 */


package gold;

public class Student {
	 private String nom; 
	 private int age ;
	 private String cours ;
	 private char grade ;


	     public Student() {
	     }

	     public Student(String nomStud, int ageStud) {
	         nom = nomStud;
	         age = ageStud;
	         this.setCours(cours);
	         this.setGrade(grade);;
	     }

	     public Student(String nom, int age, String cours, char grade) {
	         this.nom = nom;
	         this.age = age;
	         this.cours = cours;
	         this.grade = grade;
	     }

	     public String getNom() {
	         return this.nom;
	     }

	     public void setNom(String nom) {
	         this.nom = nom;
	     }

	     public int getAge() {
	         return this.age;
	     }

	     public void setAge(int age) {
	         this.age = age;
	     }

	     public String getCours() {
	         return this.cours;
	     }

	     public void setCours(String cours) {
	         this.cours = cours;
	     }

	     public char getGrade() {
	         return this.grade;
	     }

	     public void setGrade(char grade) {
	         this.grade = grade;
	     }

	     public Student nom(String nom) {
	         setNom(nom);
	         return this;
	     }

	     public Student age(int age) {
	         setAge(age);
	         return this;
	     }

	     public Student cours(String cours) {
	         setCours(cours);
	         return this;
	     }

	     public Student grade(char grade) {
	         setGrade(grade);
	         return this;
	     }

	    
	    

	    
	     public String displayStudentInfo() {
	         return "{" +
	             " nom='" + getNom() + "'" +
	             ", age='" + getAge() + "'" +
	             ", cours='" + getCours() + "'" +
	             ", grade='" + getGrade() + "'" +
	             "}";
	     }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student();
		student1.setNom("lagou ");
		student1.setAge(20);
		student1.setCours("informatique");
		student1.setGrade('A');
		
		Student student2 = new Student("lagou ",20);
		student2.setCours("Francais");
		student2.setGrade('A');
		
		Student student3 = new Student("lagou ",20,"informatique",'A');
		
		System.out.println("Information Student : "+student1.displayStudentInfo());
		
		System.out.println("Information Student : "+student2.displayStudentInfo());
		
		System.out.println("Information Student : "+student3.displayStudentInfo());

	}

}

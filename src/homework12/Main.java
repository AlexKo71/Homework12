package homework12;

public class Main {


    public static void main(String[] arg) {
        Author nabokov = new Author("Vladimir", "Nabokov");
        Author tolstoy = new Author("Leo", "Tolstoy");
        Book annaKarenina = new Book("Anna Karenina", new Author(tolstoy.getFirstName(), tolstoy.getLastName()), 2015);
        Book invitationToBeheading = new Book("Invitation to a Beheading", new Author(nabokov.getFirstName(), nabokov.getLastName()), 2020);
        annaKarenina.setYearPublishing(2021);
        System.out.println(nabokov.getFirstName() + " " + nabokov.getLastName());
        System.out.println(tolstoy.getFirstName() + " " + tolstoy.getLastName());
        System.out.println(annaKarenina.getName() + " " + annaKarenina.getSurname() + " " + annaKarenina.getYearPublishing());
        System.out.println(invitationToBeheading.getName() + " " + invitationToBeheading.getSurname() + " " + invitationToBeheading.getYearPublishing());

    }


}


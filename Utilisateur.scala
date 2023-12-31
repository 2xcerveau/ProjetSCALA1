package IMSD.Projet.Scala
import scala.io.StdIn


object Utilisateur {
  def main(args: Array[String]): Unit = {
    val bibliothèque = new Bibliothèque()





    // Exemple d'utilisation


    var Y_N: String = StdIn.readLine("Pour ajouter un livre, veuillez insérer 'oui', sinon autre chose : ")

    if (Y_N.toLowerCase() == "oui") {
      var encore: String = "oui"

      while (encore.toLowerCase() == "oui") {
        val nouveauLivre = new Livre(
          StdIn.readLine("Insérer le titre du livre : "),
          StdIn.readLine("Insérer l'auteur du livre : "),
          StdIn.readLine("Insérer l'année de publication : ")
        )

        bibliothèque.ajouterLivre(nouveauLivre)
        encore = StdIn.readLine("Voulez-vous ajouter encore un autre livre ? ")
      }
    }


    println("\n debut \n")

    var binaire1: String = StdIn.readLine("Voulez vous empruntez un livre, si oui insérez 'oui', sinon autre chose : ")

    if (binaire1.toLowerCase() == "oui") {

      var encore: String = "oui"

      while (encore.toLowerCase() == "oui") {

        bibliothèque.emprunterLivre(StdIn.readLine("\n Pour emprunter un livre, inserez le titre du livre \n "))
        encore = StdIn.readLine("Voulez-vous emprunter encore un autre livre ? ")
      }
    }

    var binaire2: String = StdIn.readLine("Voulez vous rendre un livre, si oui insérez 'oui', sinon autre chose : ")

    if (binaire2.toLowerCase() == "oui") {
      var encore: String = "oui"

      while (encore.toLowerCase() == "oui") {
        bibliothèque.rendreLivre(StdIn.readLine("\n Pour rendre un livre inserez le titre du livre \n "))
        encore = StdIn.readLine("Voulez-vous rendre encore un autre livre ? ")
      }
    }
  }
}



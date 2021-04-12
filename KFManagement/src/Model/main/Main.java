package Model.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Model.Activity;
import Model.CompteRendu;
import Model.Cotisation;
import Model.Membre;
import Model.MembreBureau;
import Model.MembreSimple;
import Model.RegleGroupe;
import Model.Reunion;
import Model.Sortie;

public class Main {
	public static void main(String[] args)
	{
		List<RegleGroupe> regles = new ArrayList<RegleGroupe>();
		regles.add(new RegleGroupe("Cotisation", "Les cotisations sont obligatoires pour tous les membres"));
		regles.add(new RegleGroupe("reunion", "la presence est obligatoire durant les reunions sinon preparez un justificatif"));
		regles.add(new RegleGroupe("injures", "Les injures sont ne sont pas toleres dans le groupe"));
		
		Membre yaya = new MembreBureau("Diallo", "Yaya", "771665938", "M", LocalDate.of(2017, 1, 1), true, "finance");
		Membre boussouriou = new MembreBureau("Diallo", "Boussouriou", "771665938", "M", LocalDate.of(2017, 1, 1), true, "communication");
		Membre kadi = new MembreSimple("Diallo", "Kadiatou", "784674534", "F", LocalDate.of(2017, 1, 1), true);
		Membre moumy = new MembreBureau("Diallo", "Mouminatou", "771274771", "F", LocalDate.of(2017, 1, 1), true, "communication");
		Membre kapara = new MembreBureau("Diallo", "Abdoulaye", "771665938", "M", LocalDate.of(2017, 1, 1), true, "vice president");
		Membre mariabhe = new MembreBureau("Diallo", "Abdoulaye", "2246283456", "M", LocalDate.of(2017, 1, 1), true, "pedagogie");
		Membre nenoush = new MembreBureau("Diallo", "Hadja Sadou", "784657574", "F", LocalDate.of(2017, 1, 1), true, "secretaire");
		Membre anita = new MembreBureau("Diallo", "Hadja Sadou", "774419545", "F", LocalDate.of(2017, 1, 1), true, "organisation");
		Membre khairy = new MembreSimple("Diallo", "Aissatou Khairy", "771665938", "F", LocalDate.of(2017, 1, 1), true);
		Membre mouctar = new MembreBureau("Diallo", "Mouctar", "773020945", "M", LocalDate.of(2017, 1, 1), true, "finance");
		Membre iyaz = new MembreBureau("Diallo", "Mamadou Oury", "771665938", "M", LocalDate.of(2017, 1, 1), true, "president");
		Membre chacha = new MembreBureau("Diallo", "Aissatou", "777620678", "M", LocalDate.of(2017, 1, 1), true, "organisation");
		
		
		Activity reunionZoom = new Reunion(LocalDate.of(2021, 1, 1), "Zoom");
		Activity reunionMedina = new Reunion(LocalDate.of(2021, 2, 1), "Medina");
		Activity reunionPA = new Reunion(LocalDate.of(2021, 3, 1), "Parcelles Assainies");

		Activity sortie = new Sortie(LocalDate.of(2021, 1, 1), "Somone");
		CompteRendu cr = new CompteRendu("sortie hors Dakar", "On a mange, danser, nager et epargner quelques frics");
		sortie.setCompteRendu(cr);
		
		Cotisation yayaJanvier = new Cotisation(1, 1000, LocalDate.of(2021, 1, 1), "espece", "Pour le mois de janvier 2021", yaya);
		Cotisation kadiJanvier = new Cotisation(1, 1000, LocalDate.of(2021, 1, 1), "OM", "Pour le mois de janvier 2021", kadi);
		Cotisation anitaJanvier = new Cotisation(1, 1000, LocalDate.of(2021, 1, 1), "wave", "Pour le mois de janvier 2021", anita);
		Cotisation iyazJanvier = new Cotisation(1, 1000, LocalDate.of(2021, 1, 1), "espece", "Pour le mois de janvier 2021", iyaz);
		Cotisation khairyJanvier = new Cotisation(1, 1000, LocalDate.of(2021, 1, 1), "espece", "Pour le mois de janvier 2021", khairy);
		Cotisation boussJanvier = new Cotisation(1, 1000, LocalDate.of(2021, 1, 1), "OM", "Pour le mois de janvier 2021", boussouriou);
		Cotisation nenoushJanvier = new Cotisation(1, 1000, LocalDate.of(2021, 1, 1), "wave", "Pour le mois de janvier 2021", nenoush);
		
	}

}

package com.mproduits;

import com.mproduits.dao.ProductDao;
import com.mproduits.model.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class MproduitsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MproduitsApplication.class, args);
	}

	@Bean
	public CommandLineRunner seedDatabase(ProductDao productDao) {
		return args -> {
			if (productDao.count() < 20) {
				productDao.deleteAll();
				productDao.save(new Product(0, "Bougie fonctionnant au feu", "bougie qui fonctionne comme une ampoule mais sans électricité !", "https://github.com/OpenClassrooms-Student-Center/4668216-Optimisez-votre-architecture-Microservices/blob/master/images/Bougie.PNG?raw=true", 22.0));
				productDao.save(new Product(1, "Chaise pour s'assoire", "Chaise rare avec non pas 1 ni 2 mais 3 pieds", "https://github.com/OpenClassrooms-Student-Center/4668216-Optimisez-votre-architecture-Microservices/blob/master/images/Chaise.PNG?raw=true", 95.0));
				productDao.save(new Product(2, "Cheval pour nains", "Ce cheval ne portera certainement pas blanche neige, mais sans problème les nains", "https://github.com/OpenClassrooms-Student-Center/4668216-Optimisez-votre-architecture-Microservices/blob/master/images/Cheval.PNG?raw=true", 360.0));
				productDao.save(new Product(3, "Coq of steel, le superman des volailles", "Ne passe pas au four", "https://github.com/OpenClassrooms-Student-Center/4668216-Optimisez-votre-architecture-Microservices/blob/master/images/coq.PNG?raw=true", 620.0));
				productDao.save(new Product(4, "Flacon à frotter with un génie dedans", "Vous donne droit à l'équivalent de 3/0 voeux", "https://github.com/OpenClassrooms-Student-Center/4668216-Optimisez-votre-architecture-Microservices/blob/master/images/lampe.PNG?raw=true", 1200.0));
				productDao.save(new Product(5, "Horloge quantique", "Donne l'heure, les minutes et même les secondes. Ne fait pas de café", "https://github.com/OpenClassrooms-Student-Center/4668216-Optimisez-votre-architecture-Microservices/blob/master/images/Horloge.PNG?raw=true", 180.0));
				productDao.save(new Product(6, "Table d'opération pour Hamsters", "Pour réaliser vos opérations chirugicales sur votre Hamster!", "https://github.com/OpenClassrooms-Student-Center/4668216-Optimisez-votre-architecture-Microservices/blob/master/images/table%20d'op%C3%A9ration.PNG?raw=true", 210.0));
				productDao.save(new Product(7, "Vase ayant appartenu a Zeus", "Risque de choc électrique", "https://github.com/OpenClassrooms-Student-Center/4668216-Optimisez-votre-architecture-Microservices/blob/master/images/Vase.PNG?raw=true", 730.0));
				productDao.save(new Product(8, "Montre connectée métropolitaine", "Montre intelligente avec suivi d'activité, notifications et autonomie longue durée.", "https://images.unsplash.com/photo-1523275335684-37898b6baf30?auto=format&fit=crop&w=800&q=80", 249.0));
				productDao.save(new Product(9, "Sac à dos urbain", "Sac à dos imperméable pour la ville, avec compartiment ordinateur et style moderne.", "https://images.unsplash.com/photo-1512436991641-6745cdb1723f?auto=format&fit=crop&w=800&q=80", 89.0));
				productDao.save(new Product(10, "Lampe solaire design", "Lampe d'extérieur à énergie solaire pour jardin et terrasse.", "https://images.unsplash.com/photo-1509395176047-4a66953fd231?auto=format&fit=crop&w=800&q=80", 79.0));
				productDao.save(new Product(11, "Enceinte Bluetooth portable", "Enceinte sans fil avec son puissant et autonomie de 12 heures.", "https://images.unsplash.com/photo-1519671482749-fd09be7ccebf?auto=format&fit=crop&w=800&q=80", 129.0));
				productDao.save(new Product(12, "Casque audio premium", "Casque circum-aural avec réduction de bruit et confort longue durée.", "https://images.unsplash.com/photo-1510070009289-b5bc34383727?auto=format&fit=crop&w=800&q=80", 199.0));
				productDao.save(new Product(13, "Appareil photo Reflex", "Capturez des moments inoubliables avec une qualité d'image exceptionnelle.", "https://images.unsplash.com/photo-1516035069371-29a1b244cc32?auto=format&fit=crop&w=800&q=80", 850.0));
				productDao.save(new Product(14, "Clavier mécanique Gamer", "Touches réactives et rétroéclairage RGB pour une expérience de jeu ultime.", "https://images.unsplash.com/photo-1511467687858-23d96c32e4ae?auto=format&fit=crop&w=800&q=80", 145.0));
				productDao.save(new Product(15, "Chaise de bureau ergonomique", "Confort optimal pour de longues heures de travail devant l'ordinateur.", "https://images.unsplash.com/photo-1505797149-43b0069ec26b?auto=format&fit=crop&w=800&q=80", 299.0));
				productDao.save(new Product(16, "Machine à café Expresso", "Savourez un café de qualité professionnelle à la maison.", "https://images.unsplash.com/photo-1517668808822-9ebb02f2a0e6?auto=format&fit=crop&w=800&q=80", 450.0));
				productDao.save(new Product(17, "Drone avec caméra 4K", "Prenez de la hauteur et réalisez des prises de vue aériennes époustouflantes.", "https://images.unsplash.com/photo-1507582020474-9a35b7d455d9?auto=format&fit=crop&w=800&q=80", 599.0));
				productDao.save(new Product(18, "Vélo électrique urbain", "Déplacez-vous sans effort et avec style en ville.", "https://images.unsplash.com/photo-1571068316344-75bc76f77891?auto=format&fit=crop&w=800&q=80", 1200.0));
				productDao.save(new Product(19, "Projecteur Home Cinéma", "Transformez votre salon en véritable salle de cinéma.", "https://images.unsplash.com/photo-1535016120720-40c646bebbbb?auto=format&fit=crop&w=800&q=80", 350.0));
			}
		};
	}
}

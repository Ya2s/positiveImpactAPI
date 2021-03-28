DROP TABLE IF EXISTS DonorProject;
DROP TABLE IF EXISTS Projectgoal cascade;
DROP TABLE IF EXISTS Donor cascade;
DROP TABLE IF EXISTS Project cascade;
/* Retravailler ces DROP car là j'ai mis des cascade à tout-va car j'avais une erreur de dépedance entre table lors de leur suppression */
 
/* FIXME : Pourquoi je crée les 2 tables ci-dessous, mais pour les 2 autres j'ai eu une erreur me disant que déjà créées ? */


CREATE TABLE Donor (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  birth_date DATE NOT NULL,
  phone_number VARCHAR(250) NOT NULL,
  mail VARCHAR(250) NOT NULL,
  password VARCHAR(250) NOT NULL
);


CREATE TABLE Project (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  title VARCHAR(250) NOT NULL,
  description VARCHAR(250) NOT NULL,
  country VARCHAR(250) NOT NULL,
  city VARCHAR(250) NOT NULL,
  required_donation_value INT
);

 

INSERT INTO Donor (id, first_name, last_name, birth_date, phone_number, mail, password) VALUES
  (1, 'Omar', 'Karrou', NOW(), '06 03 03 94 03', 'o.karou@gmxil.com', 'monmdp'),
  (2, 'Amélie', 'Prai', NOW(), '06 03 02 03 04', 'ampr34@yahou.fr', 'amprai'),
  (3, 'Sadio', 'Manze', NOW(), '06 43 54 23 87', 'sadio.manze@prton.com', 'smze');
  

  
INSERT INTO Project_Category (id, name) VALUES
  (1, 'Planter arbre'),
  (2, 'Creer un puit'),
  (3, 'Donner un kit de scolarite enfants issus de famille pauvre');
  
  
INSERT INTO Project (id, title, description, country, city, required_donation_value) VALUES
  (1, 'Un arbre dans la forêt de Orléans', 'Elargissez avec nous la forêt de Orléans','France','Orléans','15000'),
  (2, '1 cartable contenant 1 trousse remplie + des cahiers', 'Aidez les enfants de famille pauvres vivant à haute altitude dans les montagnes du Tibet', 'Chine', 'Tibet', 5000);
  

/* Nul besoin de créer la table (association) donor_project, elle est créée via le code */  
INSERT INTO Donor_Project (value_euro, message, donor_id, project_id) VALUES 
  	(5, 'Merci pour ce que vous faites', 1, 1),
  	(13, 'Gracias', 3, 2);
  
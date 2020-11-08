insert into MARQUE(m_id, m_name) values(1,'Renauld');
insert into MARQUE(m_id, m_name) values(2,'Peugeot');
insert into MARQUE(m_id, m_name) values(3,'Dacia');
insert into MARQUE(m_id, m_name) values(4,'Tesla');
insert into MARQUE(m_id, m_name) values(5,'Ford');

insert into CLIENT(cl_id, cl_name) values(1,'bob');
insert into CLIENT(cl_id, cl_name) values(2,'bill');
insert into CLIENT(cl_id, cl_name) values(3,'Pierre');
insert into CLIENT(cl_id, cl_name) values(4,'Jean');
insert into CLIENT(cl_id, cl_name) values(5,'Emmanuelle');
insert into CLIENT(cl_id, cl_name) values(6,'Marc');
insert into CLIENT(cl_id, cl_name) values(7,'George');
insert into CLIENT(cl_id, cl_name) values(8,'Michel');
insert into CLIENT(cl_id, cl_name) values(9,'Jean-Pierre');
insert into CLIENT(cl_id, cl_name) values(10,'Adrien');

insert into concessionnaire(co_id, co_name) values(1,'vendeur_1');
insert into concessionnaire(co_id, co_name) values(2,'vendeur_2');
insert into concessionnaire(co_id, co_name) values(3,'vendeur_3');
insert into concessionnaire(co_id, co_name) values(4,'vendeur_4');
insert into concessionnaire(co_id, co_name) values(5,'vendeur_5');

insert into Adresse(a_addr, concessionnaire_co_id) values('9 rue de la paix', 1);
insert into Adresse(a_addr, concessionnaire_co_id) values('8 rue de la l égalité', 2);
insert into Adresse(a_addr, concessionnaire_co_id) values('12 rue Jean Jaurès', 3);
insert into Adresse(a_addr, concessionnaire_co_id) values('24 rue Victor Hugo', 4);
insert into Adresse(a_addr, concessionnaire_co_id) values('3 rue Gal De Gaulle', 5);

insert into VOITURE(v_id, v_name, marque_m_id, client_cl_id) values(1,'206',2, 2);
insert into VOITURE(v_id, v_name, marque_m_id, client_cl_id) values(2,'207',2, 1);
insert into VOITURE(v_id, v_name, marque_m_id, client_cl_id) values(3,'Twingo',1, 2);
insert into VOITURE(v_id, v_name, marque_m_id, client_cl_id) values(4,'206',2, 3);
insert into VOITURE(v_id, v_name, marque_m_id, client_cl_id) values(5,'Fiesta',5, 4);
insert into VOITURE(v_id, v_name, marque_m_id, client_cl_id) values(6,'Sandero',3, 5);
insert into VOITURE(v_id, v_name, marque_m_id, client_cl_id) values(7,'Duster',3, 6);
insert into VOITURE(v_id, v_name, marque_m_id, client_cl_id) values(8,'206',2, 7);
insert into VOITURE(v_id, v_name, marque_m_id, client_cl_id) values(9,'206',2, 8);
insert into VOITURE(v_id, v_name, marque_m_id, client_cl_id) values(10,'Model X',4, 10);


insert into MARQUE_CONCESSIONAIRE (m_id, co_id) values(1,1);
insert into MARQUE_CONCESSIONAIRE (m_id, co_id) values(1,2);
insert into MARQUE_CONCESSIONAIRE (m_id, co_id) values(1,3);
insert into MARQUE_CONCESSIONAIRE (m_id, co_id) values(2,1);
insert into MARQUE_CONCESSIONAIRE (m_id, co_id) values(2,2);
insert into MARQUE_CONCESSIONAIRE (m_id, co_id) values(2,3);
insert into MARQUE_CONCESSIONAIRE (m_id, co_id) values(3,5);
insert into MARQUE_CONCESSIONAIRE (m_id, co_id) values(4,5);
insert into MARQUE_CONCESSIONAIRE (m_id, co_id) values(5,4);
insert into MARQUE_CONCESSIONAIRE (m_id, co_id) values(5,1);
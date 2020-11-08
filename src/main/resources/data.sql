insert into MARQUE(m_id, m_name) values(1,'Renauld');
insert into MARQUE(m_id, m_name) values(2,'Peugeot');

insert into CLIENT(cl_id, cl_name) values(1,'bob');
insert into CLIENT(cl_id, cl_name) values(2,'bill');

insert into concessionnaire(co_id, co_name) values(1,'vendeur_1');
insert into concessionnaire(co_id, co_name) values(2,'vendeur_2');


insert into Adresse(a_addr, concessionnaire_co_id) values('9 rue de la paix', 1);
insert into Adresse(a_addr, concessionnaire_co_id) values('8 rue de la l égalité', 1);



insert into VOITURE(v_id, v_name, marque_m_id, client_cl_id) values(1,'206',2, 2);
insert into VOITURE(v_id, v_name, marque_m_id, client_cl_id) values(2,'207',2, 1);
insert into VOITURE(v_id, v_name, marque_m_id, client_cl_id) values(3,'Twingo',1, 2);
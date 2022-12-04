insert into categoria(nome, descricao) values('TI', 'Tecnologia da Informação');
insert into categoria(nome, descricao) values('RH', 'Recursos humanos');

insert into perfil(descricao) values('OPERADOR');
insert into perfil(descricao) values('ADMINISTRADOR');

insert into usuario(data_registro, email, login, nome, senha) values('2022-01-02', 'maria@email.com', 'maria123', 'maria', '123'  );
insert into usuario(data_registro, email, login, nome, senha) values('2015-11-03', 'jose@email.com', 'jose123', 'jose', '12345'  );
insert into usuario(data_registro, email, login, nome, senha) values('2015-11-03', 'marcos@email.com', 'marcos123', 'marcos', '12345'  );

insert into usuario_perfil(usuario_id, perfil_id) values(1, 1);
insert into usuario_perfil(usuario_id, perfil_id) values(2, 2);


insert into vaga(data_publicacao, descricao, salario_em_real, status, titulo, usuario_criador_id, categoria_id) values('2022-01-02', 'Vaga para programador PHP Jr com pelo menos 1 ano de experiência. Conhecimento em POO e PDO são obrigatórios. Desejável: ter ensino superior na área.', 4000, 'FECHADA', 'Programador Jr Backend', 2, 1);
insert into vaga(data_publicacao, descricao, salario_em_real, status, titulo, usuario_criador_id, categoria_id) values('2022-11-12', 'Vaga para programador Java Jr com pelo menos 1 ano de experiência. Conhecimento em POO e PDO são obrigatórios. Desejável: ter ensino superior na área.', 3000, 'ATIVA', 'Programador Jr Backend JAVA', 2, 1);
insert into vaga(data_publicacao, descricao, salario_em_real, status, titulo, usuario_criador_id, categoria_id) values('2020-12-25', 'Vaga para programador Ruby Pl com pelo menos 2 anos de experiência. Conhecimento em POO e PDO são obrigatórios. Desejável: ter ensino superior na área.', 5000, 'CRIADA', 'Programador Pl Backend', 2, 1);
insert into vaga(data_publicacao, descricao, salario_em_real, status, titulo, usuario_criador_id, categoria_id) values('2020-11-22', 'Vaga para programador PHP Jr com pelo menos 1 ano de experiência. Conhecimento em POO e PDO são obrigatórios. Desejável: ter ensino superior na área.', 6000, 'ATIVA', 'Programador Jr Backend', 2, 1);
insert into vaga(data_publicacao, descricao, salario_em_real, status, titulo, usuario_criador_id, categoria_id) values('2022-10-09', 'Vaga para programador Java Sr com pelo menos 10 anos de experiência. Conhecimento em POO,SOLID, Microserviços, Kafka, SCRUM, Processamento paralelo são obrigatórios. Desejável: ter ensino superior na área.', 44000, 'ATIVA', 'Programador Sr Backend', 2, 1);
insert into vaga(data_publicacao, descricao, salario_em_real, status, titulo, usuario_criador_id, categoria_id) values('2022-02-02', 'Vaga para programador Python Jr com pelo menos 1 ano de experiência. Conhecimento em PDO são obrigatórios. Desejável: ter ensino superior na área.', 4040.40, 'CRIADA', 'Programador Jr Backend', 2, 1);
insert into vaga(data_publicacao, descricao, salario_em_real, status, titulo, usuario_criador_id, categoria_id) values('2022-11-12', 'Vaga para programador PHP Sr com pelo menos 5 anos de experiência. Conhecimento em POO e PDO são obrigatórios. Desejável: ter ensino superior na área.', 7000, 'CRIADA', 'Programador Sr Backend', 2, 1);
insert into vaga(data_publicacao, descricao, salario_em_real, status, titulo, usuario_criador_id, categoria_id) values('2022-11-02', 'Vaga para programador Javascript Trainee com pelo menos 1 ano de experiência. Conhecimento em POO e PDO são obrigatórios. Desejável: ter ensino superior na área.', 4050.60, 'ATIVA', 'Programador Jr Backend', 2, 1);

insert into arquivo(caminho, nome, tamanho, tipo) values('/tmp/apps/spring/pdfs/cv-joao.pdf', 'cv-joao', '1MB', 'pdf');
insert into arquivo(caminho, nome, tamanho, tipo) values('/tmp/apps/spring/pdfs/cv-maria.pdf', 'cv-maria-silva', '2MB', 'pdf');


insert into solicitacao(comentario, data_solicitacao, arquivo_id, usuario_aplicante_id, vaga_id) values('Vaga muito legal!!', '2022-12-19', 1, 1, 2);
insert into solicitacao(comentario, data_solicitacao, arquivo_id, usuario_aplicante_id, vaga_id) values('Me contratem, por favor!!', '2022-12-19', 2, 2, 2);



-- Os parâmetros passados são todos aqueles que não são gerados automaticamente
-- Por exemplo, não se passa os parâmetros de turmas_id pois colocamos que seria gerado automaticamente 
-- Inserir na tabela -> variável nome, variável nota_media (é o mesmo nome do atributo que se declara na classe)

INSERT INTO tb_professores(nome, nota_media) VALUES ('Dirshow', 5.0);
INSERT INTO tb_professores(nome, nota_media) VALUES ('Nikola Tesla', 4.2);
INSERT INTO tb_professores(nome, nota_media) VALUES ('Einstein', 4.4);
INSERT INTO tb_professores(nome, nota_media) VALUES ('Alan Turing', 5.0);
INSERT INTO tb_professores(nome, nota_media) VALUES ('Ada Lovelace', 5.0);

INSERT INTO tb_turmas(nome, nota_media, semestre, professor_id) VALUES ('Programação Orientada à Objetos', 5.0, '2021/2', 1);
INSERT INTO tb_turmas(nome, nota_media, semestre, professor_id) VALUES ('Física 3', 4.5, '2022/1', 2);
INSERT INTO tb_turmas(nome, nota_media, semestre, professor_id) VALUES ('Física 4', 4.4, '2022/2', 3);
INSERT INTO tb_turmas(nome, nota_media, semestre, professor_id) VALUES ('Fundamentos de Matemática para Computação', 5.0, '2021/2', 4);
INSERT INTO tb_turmas(nome, nota_media, semestre, professor_id) VALUES ('Matemática Discreta', 5.0, '2021/1', 4);
INSERT INTO tb_turmas(nome, nota_media, semestre, professor_id) VALUES ('Matemática Discreta', 5.0, '2020/2', 4);
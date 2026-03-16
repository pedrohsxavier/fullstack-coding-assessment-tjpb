CREATE TABLE solicitacao (
     id SERIAL PRIMARY KEY,
     titulo VARCHAR(255) NOT NULL,
     descricao TEXT NOT NULL,
     solicitante VARCHAR(255) NOT NULL,
     data_criacao TIMESTAMP NOT NULL,
     status VARCHAR(50) NOT NULL
);

# Sistema de Biblioteca

## Sobre o projeto

O projeto consiste no desenvolvimento de um Sistema de Biblioteca utilizando Java, Spring Boot, Thymeleaf, HTML e CSS. O objetivo é organizar e apresentar informações sobre livros, autores, categorias, usuários e empréstimos, permitindo também realizar o cadastro e a exclusão de livros.

## Correções dos erros 404 e 500

Durante o desenvolvimento, foram identificados problemas que impediam o funcionamento correto das páginas do sistema.

O erro **404 (Not Found)** ocorria devido a inconsistências nos caminhos das rotas e na localização dos arquivos HTML. Para corrigir esse problema, foram ajustados os endereços no Controller e organizados os arquivos dentro da pasta `templates/livros`, garantindo que os caminhos retornados pelo Spring Boot correspondessem aos arquivos existentes.

O erro **500 (Internal Server Error)** estava relacionado a problemas no processamento das páginas e na comunicação entre o Controller e o Thymeleaf. Foram corrigidos os retornos das páginas e o envio dos atributos necessários pelo Model, evitando que as telas tentassem acessar informações que não haviam sido disponibilizadas.

Também foi definida a rota `/livros` como página inicial do sistema, facilitando o acesso e a navegação.

## Melhorias e funcionalidades adicionadas

### Gerenciamento de livros

Foi implementada uma lista utilizando `ArrayList` para armazenar os livros durante a execução do sistema. Com isso, foram adicionadas as funcionalidades de:

- Listagem dos livros cadastrados.
- Cadastro de novos livros por meio de formulário.
- Exclusão de livros cadastrados.
- Exibição das informações de título, autor e ISBN.

Também foram adicionados dois livros como exemplos iniciais: **Dom Casmurro**, de Machado de Assis, e **O Pequeno Príncipe**, de Antoine de Saint-Exupéry.

### Autores

Foi criada uma classe específica para representar os autores, contendo nome e nacionalidade. Foram adicionados Machado de Assis e Antoine de Saint-Exupéry como exemplos para visualização na página.

### Categorias

Foi implementada uma classe para organizar as categorias dos livros, contendo nome e descrição. Foram adicionadas as categorias Literatura Brasileira e Literatura Infantil.

### Usuários

Foi criada uma classe para representar os usuários da biblioteca, contendo nome, matrícula e e-mail. Foram adicionados dois usuários como exemplos iniciais.

### Empréstimos

Foi criada uma classe para representar os empréstimos, contendo o título do livro, o nome do usuário, a data do empréstimo e a data prevista para devolução. Também foram adicionados dois registros de exemplo.

## Organização do projeto

O projeto foi organizado separando as responsabilidades entre as classes Java e os arquivos de apresentação.

A pasta `controller` contém o LivroController, responsável pelas rotas, pelo recebimento das informações e pela comunicação com as páginas.

A pasta `model` contém as classes Livro, Autor, Categoria, Usuario e Emprestimo, responsáveis por representar os dados utilizados pelo sistema.

A pasta `templates/livros` reúne todas as páginas HTML, incluindo a página inicial, a listagem e o cadastro de livros, além das páginas de autores, categorias, usuários e empréstimos.

A pasta `static/css` contém o arquivo `estilo.css`, responsável pela aparência visual das páginas.

## Interface e navegação

O visual do sistema foi organizado utilizando uma paleta de cores com tons de bege e marrom, mantendo uma identidade relacionada ao tema de biblioteca.

A página inicial apresenta os links para as diferentes áreas do sistema, facilitando a navegação entre livros, autores, categorias, usuários e empréstimos.

Também foram organizadas as páginas de listagem e cadastro, com formulários, botões e áreas de apresentação das informações.

## Armazenamento dos dados

Nesta etapa, os dados são armazenados em listas utilizando `ArrayList`, sem integração com banco de dados.

Isso permite cadastrar e excluir livros durante a execução do sistema. Entretanto, as alterações não são permanentes, pois os dados ficam armazenados apenas na memória e são reiniciados quando a aplicação é encerrada.

Os autores, categorias, usuários e empréstimos possuem registros iniciais para demonstração e visualização das páginas.

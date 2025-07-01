# Sistema de Cadastro de Usuários em Java

Um sistema simples baseado em console para gerenciamento de usuários, construído em Java, permitindo registrar, listar, editar e excluir usuários utilizando recursos básicos de Java como `ArrayList`, `Scanner` e Programação Orientada a Objetos (POO).

---

## Funcionalidades

- Registrar novos usuários (nome, email, idade)
- Listar todos os usuários registrados
- Editar dados de usuários
- Excluir usuários com confirmação
- Validação de entradas para todos os campos
- Interface de usuário simples e limpa no console

---

## Tecnologias Utilizadas

- Java 17 ou superior
- Programação Orientada a Objetos
- `ArrayList` para armazenamento dinâmico de usuários
- `Scanner` para leitura de entradas do usuário
- Navegação simples através de menu

---

## Como Executar

### Pré-requisitos
- JDK 17 ou superior instalado
- Um terminal ou IDE (VS Code, IntelliJ, Eclipse, etc.)

### Compilação (via terminal)

```bash
javac Cadastro.java Usuario.java
```

### Execução

```bash
java Cadastro
```

---

## Visão Geral das Classes

### `Usuario.java`

Define a classe `Usuario` com os seguintes campos:
- `name` (nome)
- `email` (email)
- `age` (idade)

Inclui métodos **getters** e **setters** para cada campo.

---

### `Cadastro.java`

Contém a lógica para:
- Interação do menu (`run()`).
- Cadastro de novos usuários (`register()`).
- Listagem de usuários registrados (`list()`).
- Edição de dados de usuários existentes (`edit()`).
- Exclusão de usuários com confirmação (`delete()`).

Além disso, inclui o método `main()` para execução.

---

## Melhorias Futuras

- Adicionar funcionalidade de busca (por nome ou email)
- Salvar/carregar usuários de um arquivo (usando serialização ou CSV)
- Criar versão com interface gráfica usando JavaFX ou Swing
- Adicionar testes unitários com JUnit

---

## Contribuindo

Pull requests são bem-vindos! Sinta-se à vontade para forkar e melhorar o sistema. Sugestões e problemas podem ser reportados a qualquer momento.

---

## Autor

**Raphael Recio**  
Estudante de Análise e Desenvolvimento de Sistemas

---

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo LICENSE para mais detalhes.

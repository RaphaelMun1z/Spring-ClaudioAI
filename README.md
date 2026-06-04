# ClaudioAI

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.0.6-6DB33F)
![Spring Security](https://img.shields.io/badge/Spring_Security-OAuth2-6DB33F)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-Templates-005F0F)
![Build](https://img.shields.io/badge/Build-Maven-C71A36)
![Status](https://img.shields.io/badge/Status-In_Development-yellow)

Aplicação web desenvolvida com Spring Boot que utiliza autenticação OAuth2 com Google para fornecer acesso seguro a uma interface de chat inspirada em assistentes de inteligência artificial modernos.

## Sobre o Projeto

O ClaudioAI foi criado como um estudo prático de integração entre autenticação federada, segurança de aplicações web e renderização server-side utilizando Thymeleaf.

Após autenticar-se com uma conta Google, o usuário é direcionado para uma interface de conversação personalizada, onde suas informações de perfil são utilizadas para compor a experiência da aplicação.

## Preview

```md
![Preview da Aplicação](docs/images/preview.png)
```

## Principais Tecnologias

- Java 21
- Spring Boot 4.0.6
- Spring Security
- OAuth2 Client
- Google OAuth2
- Thymeleaf
- Maven

## Funcionalidades

- Autenticação com Google OAuth2
- Controle de acesso com Spring Security
- Recuperação de dados do usuário autenticado
- Exibição de nome e foto de perfil
- Layouts reutilizáveis com Thymeleaf Fragments
- Interface de chat moderna e responsiva
- Gerenciamento de sessão autenticada

## Status do Projeto

| Funcionalidade | Status |
|---------------|---------|
| Login com Google OAuth2 | Complete |
| Spring Security | Complete |
| Thymeleaf Layouts | Complete |
| Recuperação de Dados do Usuário | Complete |
| Interface de Chat | Complete |
| Integração com IA | In Progress |
| Histórico de Conversas | Planned |
| Persistência em Banco de Dados | Planned |
| Upload de Arquivos | Planned |

## Estatísticas do Projeto

| Item | Valor |
|--------|--------|
| Linguagem Principal | Java |
| Versão Java | 21 |
| Framework | Spring Boot 4.0.6 |
| Segurança | Spring Security |
| Autenticação | OAuth2 + Google |
| Template Engine | Thymeleaf |
| Build Tool | Maven |
| Arquitetura | MVC |

## Pré-requisitos

Antes de executar o projeto, certifique-se de possuir:

- Java 21 ou superior
- Maven 3.9 ou superior
- Credenciais OAuth2 configuradas no Google Cloud Console

## Executando o Projeto

Clone o repositório:

```bash
git clone https://github.com/seu-usuario/claudioai.git
```

Acesse o diretório do projeto:

```bash
cd claudioai
```

Execute a aplicação:

```bash
mvn spring-boot:run
```

A aplicação ficará disponível em:

```text
http://localhost:8080
```

## Roadmap

### Curto Prazo

- [ ] Integração com API de IA
- [ ] Persistência de mensagens
- [ ] Criação de múltiplas conversas
- [ ] Histórico de chats

### Médio Prazo

- [ ] Upload de arquivos
- [ ] Streaming de respostas
- [ ] Integração com PostgreSQL
- [ ] Pesquisa em conversas

### Longo Prazo

- [ ] Suporte a múltiplos provedores de IA
- [ ] Memória contextual por usuário
- [ ] Dashboard administrativo
- [ ] Deploy automatizado

## Objetivo

Este projeto tem como objetivo servir de referência para estudos de:

- Spring Security
- OAuth2 Authentication
- Integração com Google Login
- Thymeleaf Layouts e Fragments
- Desenvolvimento de aplicações web modernas com Spring Boot

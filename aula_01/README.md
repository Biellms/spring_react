<h1>Criando o 1º projeto no Spring Initializer</h1>

<br />

<h2>Passo 01 - Abrindo o Spring Initializr no Spring Tool Suite (STS)</h2>

<br />

1) Abra o STS
2) Para abrir o **Spring Initializer**, clique no menu **File ⇨ New**, e clique na opção **Spring Starter Project**

<br />

<div align="center"><img src="https://i.imgur.com/1eNgXjO.png" title="source: imgur.com" /></div>

<br /> 

<h2>Passo 02 - Setup do Projeto</h2>

<br />

<h3>Configurações iniciais</h3>

<br />

<div align="center"><img src="https://i.imgur.com/47zc9js.png" title="source: imgur.com" /></div>

<br />

| Item             | Descrição                                                    |
| ---------------- | ------------------------------------------------------------ |
| **Name**         | Nome do Projeto (Geralmente em letras minúsculas)            |
| **Type**         | Define o Gerenciador de Dependências (Maven)                 |
| **Packaging**    | Define como a aplicação será empacotada (JAR)                |
| **Java Version** | Versão do Java (a versão da imagem pode ser diferente da sua tela) |
| **Language**     | Linguagem (Java)                                             |
| **Group**        | O domínio reverso de sua empresa ou organização. **Exemplo:** *generation.org.br* => ***br.org.generation*** |
| **Artifact**     | O artefato a ser gerado, ou seja, o nome da aplicação que será criada (Mesmo nome do projeto) |
| **Version**      | Versão da API (não alterar)                                  |
| **Description**  | Descrição do projeto                                         |
| **Package**      | Estrutura do pacote inicial da aplicação (Group + Artifact). Exemplo: ***<u>br.org.generation.helloworld</u>*** |

<br />

**Dependências**

<br />

Neste projeto vamos inserir 3 dependências, conforme mostra a figura abaixo:

<br />

<div align="center"><img src="https://i.imgur.com/jeY8cYu.png" title="source: imgur.com" /></div>

<br />

| Dependência               | Descrição                                                    |
| ------------------------- | ------------------------------------------------------------ |
| **Spring Web**            | Fornece todas as Bibliotecas necessárias para trabalhar com o protocolo http. |
| **Spring Boot Dev Tools** | Permite a atualização do projeto em tempo real durante o processo de Desenvolvimento da aplicação. |
| **Validation**            | Fornece um conjunto de anotações que permite validar os atributos das Classes da Camada Model. |


<br />

Clique no botão **Finish** para concluir.

<br />

<div align="center"> <h2>*** IMPORTANTE ***</h2></div>

Caso o projeto apresente algum erro no arquivo pom.xml, utilize o <b>Guia de correção do arquivo pom.xml</b> para corrigir o problema.

<br />

<h2>Passo 03 - Ajuste da versão do Java (17 para 16) - arquivo pom.xml</h2>

<br />

**Caso você tenha configurado o seu projeto com a versão 11 do Java, ignore este passo.**

Em Setembro de 2021 foi lançada a mais nova versão do Java (versão 17). Como a versão atual do STS ainda não possui o suporte à esta nova versão, faremos um ajuste para utilizar a versão anterior do Java (versão 16).

Vamos Alterar a linha abaixo no arquivo pom.xml:

```xml
	<properties>
		<java.version>17</java.version>
	</properties>
```

para:

```xml
	<properties>
		<java.version>16</java.version>
	</properties>
```

<br />

Na sequência, vamos atualizar o nosso projeto:

1) Clique com o botão direito do mouse sobre a pasta do projeto, selecione a opção <b>Maven</b> e clique no item <b>Update Project...</b>

<div align="center"><img src="https://i.imgur.com/ZLAyNgI.png" title="source: imgur.com" /></div>



2) Na próxima janela, marque a opção **Force Update os Snapshots/Releases** e clique no botão **OK** para concluir.



<div align="center"><img src="https://i.imgur.com/vg09z95.png" title="source: imgur.com" /></div>


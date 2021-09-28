## História

- **Brendan Eich** - Criador do JS - Um dos fundadores do Mozilla.

- Javascript **foi lançado em set/1995** em conjunto com o browser NetScape, iniciado com o nome Mocha, passando para Livescript e por fim Javascript.

- Javascript **não é baseado em java**, esse nome foi uma estratégia de marketing devido ao lançamento do java, para popularizar o Javascript.

- **ECMAScript** > *ECMA International* > especificação da Linguagem de Programação, mantendo padrões entre as lps.

    >Existem propostas para melhorias e padronizações do ECMAScript(para membros do TC39):
    >https://github.com/tc39/proposals

- **Últimas especificações implementadas:**
    * **ES2018:**
        - Operadoeres res/spread
        - Iteração assíncrona
        - Promise.prototype.finally()
    
    * **ES.Next**
        - Não está disponível oficialmente, mas trará futuras implementações. Porém pode ser usada pelo Babel.

- **Babel:** Transforma a implementação de funcionalidades novas em uma implementação que suporta o maior número de browsers(**ES2015**)

## Conceitos

- **Linguagem Interpretada:** o código é executado de cima pra baixo, e o resultado é imediatamente retornado(diferente de linguagens compiladas como C e C++).

- **Tipagem fraca:** É possível concatenar variáveis de tipos diferentes sem apresentar erro (diferente de python, por exemplo que é uma linguagem de tipagem forte).

- **Tipagem dinâmica:** Não é necessário explicitar o tipo da variável no momento da criação, e isso pode causar problemas, para isso *temos o Typescript que adiciona tipos e funcionalidades que o Javascript não tem por padrão*.
    -- https://www.typescriptlang.org/

    >Temos também o Flow, mas não possui todos os recursos do Typescript.

- **Funções de primeira classe e ordem maior:** Função que pode ser atribuida à uma variável, estrutura de dados, passada por argumentos ou até retornada em outras funções.

- **Closure:** capacidade de uma função lembrar do ambiente em que foi criada.

- **Currying:** transformar função com *n* parâmetros em uma única função. Exemplo:
    ~~~~
    function multiplica(a){
        return function(b){
            return a * b;
        }
    }

    // passando um parametro para a primeira função e armazenando para não precisar repetir esse param.
    const funcao2 = multiplica(2);

    funcao2(1); // retorna 2 
    funcao2(2); // retorna 4
    funcao2(3); // retorna 6
    ~~~~

- **Hoisting:** declarações são elevadas ao escopo(bloco, funcão ou global). As variáveis são reconhecidas, mesmo antes de um valor ser atribuido a elas.

- **Imutabilidade:** após a criação, não há edição, e sim ocorre uma nova criação, sem alterar a antiga. Por exemplo um objeto com x atributos, que ao executar uma função deverá retornar o conjunto dos atributos. Essa função pode gerar um novo atributo apenas durante a sua execução. Mas o objeto original permanecerá imutável.

## Tipos e Variáveis

>    //escopo global 

>    { 
>    // escopo de bloco 
>    }

>    function test(){
>        //escopo de função
>    }

- **var:** não obedece os tipos de escopo e pode ser alterado.

- **let:** obedece os tipos de escopo  e pode ser alterado.

- **const:** obedece os tipos de escopo e não podemos alterar o valor de uma const, mas podemos trocar as propriedades de um objeto ou array
    >Exemplo objeto:
    ><code>const user= {name= 'Victor' };</code> 
    > pode virar 
    ><code> user.name = 'Sofia';</code>

    No caso do array podemos adicionar novos tens, remover e alterar diretamente também.
    
    >Exemplo Array:
    ><code>const user= {name= 'Victor' };</code> 
    > pode virar 
    ><code> user.name = 'Sofia';</code>


### 6 tipos primitivos:

- **string:** representa qualquer tipo de texto.
    > **funções úteis para string podem ser encontradas no arquivo anotacoes.js** 

- **number:** representa somente números.

- **boolean:** representa true ou false

- **null:** representa um valor nulo

- **undefined:** representa uma variável que existe mas seu valor ainda não foi atribuido.

- **symbol:** permite criar valores únicos.


### Outros tipos:

- **Object:** basicamente é um objeto, que pode conter atributos.

- **function:** também é um objeto, e permite que o mesmo seja chamado.

- **array:** também é objeto, mas possui uma relação com seus itens de acordo com a posição e valor.



//         STRING             //

    // criando uma string.
    const texto = 'TextoAqui';
    console.log(`string: ${texto}`);


    // armazena o tamanho de uma string.
    const tamanho = texto.length;
    console.log(`length: ${tamanho}`);


    //retorna um array quebrando a string pelo delimitador *a*.
    const splitted = texto.split('A'); 
    console.log(`split: ${splitted}`);


    // busca um valor e subtitui por outro.
    const replaced = texto.replace('Aqui','Ali'); 
    console.log(`replace: ${replaced}`);


    // retorna a ultima letra de uma string.
    const last = texto.slice(-1); 
    console.log(`slice last: ${last}`);


    //retorna do primeiro até a penultimo caractere da string.
    const allWithoutLast = texto.slice(0, -1); 
    console.log(`slice all without last: ${allWithoutLast}`);


    // retorna do segundo até o último caractere da string.
    const secondToEnd = texto.slice(1); 
    console.log(`slice second to end: ${secondToEnd}`);


    // retorna os dois primeiros caracteres da string.
    const twoCharsBeforeFirstPos = texto.substr(0, 2); 
    console.log(`substr two chars before first position: ${twoCharsBeforeFirstPos}`);


//         NUMBER            //

    

//importar
const { palindrome } = require('../para-probar')

//primer test unitario
test('palindrome de generation',()=>{
    const resultado = palindrome ('generation');

    //comparar
    expect(resultado).toBe('noitareneg');

});


test('palindrome usando undefined',()=>{
    const resultado = palindrome();

    expect(resultado).toBe(undefined);
})


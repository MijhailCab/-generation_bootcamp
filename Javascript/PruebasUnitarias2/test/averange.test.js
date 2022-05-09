const { average } = require('../para-probar');

describe('average',() => {
    test('ingresar un solo valor', () => {
        expect(average([1])).toBe(1);
    })

    test('usando multiples valores', () => {
        expect(average([1,2,3,4,5,6])).toBe(3,5);
    })

        //crear un test para probar un valor undefined
        //metodo para probar un valor undefined
})

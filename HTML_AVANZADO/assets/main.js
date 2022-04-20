const color = document,querySelector("inputColor")
console.log(color)

color.addEventListener("change", function (e){
    document.body.style.backgroundColor = e.target.value;
})

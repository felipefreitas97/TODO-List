document.getElementById("adicionar").onclick = function(){
   var visibilidadeCadastro = document.getElementById("cadastroTarefa");
   if (visibilidadeCadastro.style.display === "none"){
    visibilidadeCadastro.style.display = "block"

   } else {visibilidadeCadastro.style.display = "none"}
}

soma=function(...n){
  somanum=0
  for(let i=0; i < n.length;i++){
    somanum+=n[i];
  }
  return somanum

}

console.log(soma(5, 4, 3, 2, 1));

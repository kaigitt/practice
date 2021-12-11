const listItems = document.querySelectorAll('li')
Array.prototype.forEach.call(listItems, item => {
  console.log(item.id);
});


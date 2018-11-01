/*const button = document.querySelector('.state-submit');
const state = {};
button.addEventListener('click', () => {
	const labels = document.querySelectorAll('label')

	labels.forEach( label => {
		state[label.getAttribute('type')] = label.value;
	});
	console.log(state);
})*/

fetch(`/api/states/${window.location.pathname.split('/')[2]}`)
	.then(res => res.json())
	.then(data => {
		const body = document.body
		const pageTitle = `<h1>${data.name}</h1>`
		
		body.innerHTML = pageTitle
	})
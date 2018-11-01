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
		const pageContent = `<h1>${data.name}</h1>
		<h2>${data.abbreviation}</h2>
		<p>Motto: ${data.motto}</p>
		<p>Fish: ${data.fish}</p>
		`
		const p = document.createElement('p');
		p.innerText = 'Cities: '
		data.city.forEach(place => {
			p.innerText += place.cityName + ', ';
		})
		
		
		body.innerHTML += pageContent + p.innerHTML
	})
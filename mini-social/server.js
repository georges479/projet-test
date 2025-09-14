const express = require('express');
const bodyParser = require('body-parser');

const app = express();
const PORT = 3000;

app.use(bodyParser.json());

let users = [];
let posts = [];

app.get('/', (req, res) => {
	res.send('Bienvenue sur Mini Social Network');
});

app.post('/register', (req, res) => {
	const { username, password } = req.body;
	if (!username || !password) {
		return res.status(400).json({ message: 'Username and password required' });
	}
	users.push({ username, password });
	res.json({ message: 'User registered successfuly' });
});

app.post('/login', (req, res) => {
	const { username, password } = req.body;
	const user = users.find(u => u.username === username && u.password);
	if (!user) {
		return res.status(401).json({ message: 'Invalide credentials' });
	}
	res.json({ message: `Welcome ${username}` });
});

app.post('/post', (req, res) => {
	const { username, content } = req.body;
	if (!username || !content) {
		return res.status(400).json({ message: 'Username and content required' });
	}
	posts.push({username, content, date: new Date() });
	res.json({message: 'Post created successfuly' });
});

app.get('/posts', (req, res) => {
	res.json(posts);
});

app.listen(PORT, () => {
	console.log(`Mini Social running on http://localhost:${PORT}`);
});

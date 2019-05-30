var mongoose = require('mongoose')
mongoose.connect('mongodb://localhost/test')
var db = mongoose.connection;
db.on('error', console.error.bind(console, 'connection error:'));
db.once('open', function () {
    // we're connected!
    console.log('We are connected!')
});
var kittySchema = mongoose.Schema({
    name: String
})
var Kitten = mongoose.model('Kitten', kittySchema)
var felyne = new Kitten({ name: "Felyne" })
console.log(felyne.name)
kittySchema.methods.speak = function () {
    /* 三元运算符 a?b:c */
    var greeting = this.name
        ? 'Meow name is ' + this.name
        : 'I donnot have a name';
    console.log(greeting)
}
var Kitten = mongoose.model("Kitten", kittySchema);
var flufly = new Kitten({ name: 'flufly' })
flufly.speak();
flufly.save(function (err, fluffy) {
    if (err) {
        return console.error(err);
    }
    console.log(kittens);
})
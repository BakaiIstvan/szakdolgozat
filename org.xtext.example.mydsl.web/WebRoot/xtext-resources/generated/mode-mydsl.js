define(["ace/lib/oop", "ace/mode/text", "ace/mode/text_highlight_rules"], function(oop, mText, mTextHighlightRules) {
	var HighlightRules = function() {
<<<<<<< HEAD
<<<<<<< HEAD
		var keywords = "alt|case|constraint|fail|future|loop|message|object|par|past|required|scenario|specification|strict";
=======
		var keywords = "alt|appear|attribute|case|changeTo|conditionsAt|constraint|contextfragment|contextmodel|distance|entity|fail|future|message|object|par|past|relation|required|scenario|specification|strict";
>>>>>>> Added Xtext for context dependent behavior
=======
		var keywords = "alt|appear|attribute|case|changeTo|conditionsAt|constraint|contextfragment|contextmodel|disappear|distance|entity|fail|future|match|message|object|par|past|relation|required|scenario|specification|strict";
>>>>>>> [xText] Added new message type: contextMessage
		this.$rules = {
			"start": [
				{token: "comment", regex: "\\/\\/.*$"},
				{token: "comment", regex: "\\/\\*", next : "comment"},
				{token: "string", regex: '["](?:(?:\\\\.)|(?:[^"\\\\]))*?["]'},
				{token: "string", regex: "['](?:(?:\\\\.)|(?:[^'\\\\]))*?[']"},
				{token: "constant.numeric", regex: "[+-]?\\d+(?:(?:\\.\\d*)?(?:[eE][+-]?\\d+)?)?\\b"},
				{token: "lparen", regex: "[({]"},
				{token: "rparen", regex: "[)}]"},
				{token: "keyword", regex: "\\b(?:" + keywords + ")\\b"}
			],
			"comment": [
				{token: "comment", regex: ".*?\\*\\/", next : "start"},
				{token: "comment", regex: ".+"}
			]
		};
	};
	oop.inherits(HighlightRules, mTextHighlightRules.TextHighlightRules);
	
	var Mode = function() {
		this.HighlightRules = HighlightRules;
	};
	oop.inherits(Mode, mText.Mode);
	Mode.prototype.$id = "xtext/mydsl";
	Mode.prototype.getCompletions = function(state, session, pos, prefix) {
		return [];
	}
	
	return {
		Mode: Mode
	};
});

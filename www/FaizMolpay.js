"use strict"

var exec = require("cordova/exec");
var fMol = {
	doPay: function(s,f){
		exec(s,f,"FaizMolpay","dopay",[]);	
		},
	callback: function(s,f){
		exec(s,f,"FaizMolpay","callback", []);
		}
	};
	
	module.exports = fMol;
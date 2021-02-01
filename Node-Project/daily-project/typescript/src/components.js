"use strict";
// namespace Components {
//   export namespace SubComponents {
//     export class Test {}
//   }
//   export class Header {
//     constructor() {
//       const element = document.createElement('div');
//       element.innerText = 'this is header';
//       document.body.appendChild(element);
//     }
//   }
//
//   export class Content {
//     constructor() {
//       const element = document.createElement('div');
//       element.innerText = 'this is content';
//       document.body.appendChild(element);
//     }
//   }
//
//   export class Footer {
//     constructor() {
//       const element = document.createElement('div');
//       element.innerText = 'this is footer';
//       document.body.appendChild(element);
//     }
//   }
// }
Object.defineProperty(exports, "__esModule", { value: true });
var Header = /** @class */ (function () {
    function Header() {
        var element = document.createElement('div');
        element.innerText = 'this is header';
        document.body.appendChild(element);
    }
    return Header;
}());
exports.Header = Header;
var Content = /** @class */ (function () {
    function Content() {
        var element = document.createElement('div');
        element.innerText = 'this is content';
        document.body.appendChild(element);
    }
    return Content;
}());
exports.Content = Content;
var Footer = /** @class */ (function () {
    function Footer() {
        var element = document.createElement('div');
        element.innerText = 'this is footer';
        document.body.appendChild(element);
    }
    return Footer;
}());
exports.Footer = Footer;

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
define("components", ["require", "exports"], function (require, exports) {
    "use strict";
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
});
// namespace Home {
//   export class Page {
//     constructor() {
//       new Components.Header();
//       new Components.Content();
//       new Components.Footer();
//     }
//   }
// }
define("page", ["require", "exports", "components"], function (require, exports, components_1) {
    "use strict";
    Object.defineProperty(exports, "__esModule", { value: true });
    var Page = /** @class */ (function () {
        function Page() {
            new components_1.Header();
            new components_1.Content();
            new components_1.Footer();
        }
        return Page;
    }());
    exports.default = Page;
});

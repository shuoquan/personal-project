
const __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
  const c = arguments.length; let r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc; let
    d;
  if (typeof Reflect === 'object' && typeof Reflect.decorate === 'function') r = Reflect.decorate(decorators, target, key, desc);
  else for (let i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
  return c > 3 && r && Object.defineProperty(target, key, r), r;
};
exports.__esModule = true;
const typeorm_1 = require('typeorm');

const Box = /** @class */ (function () {
  function Box() {
  }
  __decorate([
    typeorm_1.PrimaryGeneratedColumn(),
  ], Box.prototype, 'id');
  __decorate([
    typeorm_1.Column({ name: 'code' }),
  ], Box.prototype, 'code');
  __decorate([
    typeorm_1.Column({ name: 'company_id' }),
  ], Box.prototype, 'companyId');
  __decorate([
    typeorm_1.Column({ name: 'name' }),
  ], Box.prototype, 'name');
  Box = __decorate([
    typeorm_1.Entity('boxes'),
  ], Box);
  return Box;
}());
exports.Box = Box;

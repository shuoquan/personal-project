import { Get, Controller, UseGuards } from '@nestjs/common';
import { AppService } from './app.service';
// import { Repository } from 'typeorm';
import { AuthGuard } from '@nestjs/passport';
import { AuthService } from './auth.service';

@Controller()
export class AppController {
  constructor(
      private readonly appService: AppService,
      private readonly authService: AuthService,
  ) {}

  @Get('token')
  async createToken(): Promise<any> {
    return await this.authService.signIn();
  }

  @Get('users')
  @UseGuards(AuthGuard())
  users(): any {
    return [1];
  }
}

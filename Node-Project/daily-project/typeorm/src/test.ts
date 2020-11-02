import { createConnection } from 'typeorm';
import { Box } from './entity/box';

createConnection({
  type: 'mysql',
  host: 'localhost',
  port: 3306,
  username: 'root',
  password: 'reload123',
  database: 'gbox_manager',
  entities: [
    'src/entity/**/*.ts',
  ],
  synchronize: true,
}).then(async (connection) => {
  const boxRepository = connection.getRepository(Box);
  const result = await boxRepository.find();
  console.log(connection);
}).catch((error) => console.log(error));

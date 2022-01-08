import { loadFile } from 'nbb';

const { handler } = await loadFile('./handler.cljs');

export { handler };
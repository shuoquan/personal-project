# from qiniu import Auth, put_file, etag
# import qiniu.config
# #需要填写你的 Access Key 和 Secret Key
# access_key = 'OexKSDgzcp8k-vuofYVqnyi7GEuDiFVR-NggaTp8'
# secret_key = 'VIrnMDmXmZxxqZAohjhWtAQHmanJHdQfs2iOAyQG'
# #构建鉴权对象
# q = Auth(access_key, secret_key)
# #要上传的空间
# bucket_name = 'sku-videos'
# #上传后保存的文件名
# key = '1.mp4'
# #生成上传 Token，可以指定过期时间等
# token = q.upload_token(bucket_name, key, 3600)
# #要上传文件的本地路径
# localfile = 'M:/临时/1.mp4'
# ret, info = put_file(token, key, localfile)
# print(info)
# assert ret['key'] == key
# assert ret['hash'] == etag(localfile)

import sys


def sum(a, b):
    return a + b


if __name__ == '__main__':
    # a = sys.argv[1]
    # b = sys.argv[2]
    # print(sys.argv[0])
    # print(a)
    # print(b)
    # print(sum(a,b))
    # print('hello world')

    # list = [1, 2, 3]
    # for item in list:
    #     print(item)
    #
    # print(list[1:])
    a = [1, 2, 2, 1]
    b = [2, 2]
    print(list(set(a) & set(b)))

/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cloudwatchevents;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.cloudwatchevents.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Amazon CloudWatch Events asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon CloudWatch Events helps you to respond to state changes in your AWS resources. When your resources change
 * state they automatically send events into an event stream. You can create rules that match selected events in the
 * stream and route them to targets to take action. You can also use rules to take action on a pre-determined schedule.
 * For example, you can configure rules to:
 * </p>
 * <ul>
 * <li>Automatically invoke an AWS Lambda function to update DNS entries when an event notifies you that Amazon EC2
 * instance enters the running state.</li>
 * <li>Direct specific API records from CloudTrail to an Amazon Kinesis stream for detailed analysis of potential
 * security or availability risks.</li>
 * <li>Periodically invoke a built-in target to create a snapshot of an Amazon EBS volume.</li>
 * </ul>
 * <p>
 * For more information about Amazon CloudWatch Events features, see the <a
 * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide">Amazon CloudWatch Developer Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCloudWatchEventsAsyncClient extends AmazonCloudWatchEventsClient implements AmazonCloudWatchEventsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Events. A credentials
     * provider chain will be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCloudWatchEventsAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonCloudWatchEventsAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Events. A credentials
     * provider chain will be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing a number of threads equal to the
     * maximum number of concurrent connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon CloudWatch Events (ex:
     *        proxy settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCloudWatchEventsAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudWatchEventsAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Events using the specified
     * AWS account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCloudWatchEventsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonCloudWatchEventsAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Events using the specified
     * AWS account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCloudWatchEventsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudWatchEventsAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCloudWatchEventsAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Events using the specified
     * AWS account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCloudWatchEventsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudWatchEventsAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonCloudWatchEventsAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCloudWatchEventsAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Events using the specified
     * AWS account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCloudWatchEventsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonCloudWatchEventsAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Events using the provided AWS
     * account credentials provider and client configuration options.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing a number of threads equal to the
     * maximum number of concurrent connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCloudWatchEventsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudWatchEventsAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudWatchEventsAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Events using the specified
     * AWS account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCloudWatchEventsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudWatchEventsAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCloudWatchEventsAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Events using the specified
     * AWS account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCloudWatchEventsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudWatchEventsAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonCloudWatchEventsAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCloudWatchEventsAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonCloudWatchEventsAsyncClientBuilder asyncBuilder() {
        return AmazonCloudWatchEventsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Events using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonCloudWatchEventsAsyncClient(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest request) {

        return deleteRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(final DeleteRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRuleRequest, DeleteRuleResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteRuleResult>() {
            @Override
            public DeleteRuleResult call() throws Exception {
                DeleteRuleResult result;

                try {
                    result = deleteRule(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeRuleResult> describeRuleAsync(DescribeRuleRequest request) {

        return describeRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRuleResult> describeRuleAsync(final DescribeRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRuleRequest, DescribeRuleResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeRuleResult>() {
            @Override
            public DescribeRuleResult call() throws Exception {
                DescribeRuleResult result;

                try {
                    result = describeRule(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisableRuleResult> disableRuleAsync(DisableRuleRequest request) {

        return disableRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableRuleResult> disableRuleAsync(final DisableRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableRuleRequest, DisableRuleResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DisableRuleResult>() {
            @Override
            public DisableRuleResult call() throws Exception {
                DisableRuleResult result;

                try {
                    result = disableRule(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<EnableRuleResult> enableRuleAsync(EnableRuleRequest request) {

        return enableRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableRuleResult> enableRuleAsync(final EnableRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableRuleRequest, EnableRuleResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<EnableRuleResult>() {
            @Override
            public EnableRuleResult call() throws Exception {
                EnableRuleResult result;

                try {
                    result = enableRule(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListRuleNamesByTargetResult> listRuleNamesByTargetAsync(ListRuleNamesByTargetRequest request) {

        return listRuleNamesByTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRuleNamesByTargetResult> listRuleNamesByTargetAsync(final ListRuleNamesByTargetRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRuleNamesByTargetRequest, ListRuleNamesByTargetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListRuleNamesByTargetResult>() {
            @Override
            public ListRuleNamesByTargetResult call() throws Exception {
                ListRuleNamesByTargetResult result;

                try {
                    result = listRuleNamesByTarget(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest request) {

        return listRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRulesResult> listRulesAsync(final ListRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRulesRequest, ListRulesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListRulesResult>() {
            @Override
            public ListRulesResult call() throws Exception {
                ListRulesResult result;

                try {
                    result = listRules(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTargetsByRuleResult> listTargetsByRuleAsync(ListTargetsByRuleRequest request) {

        return listTargetsByRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTargetsByRuleResult> listTargetsByRuleAsync(final ListTargetsByRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTargetsByRuleRequest, ListTargetsByRuleResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListTargetsByRuleResult>() {
            @Override
            public ListTargetsByRuleResult call() throws Exception {
                ListTargetsByRuleResult result;

                try {
                    result = listTargetsByRule(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutEventsResult> putEventsAsync(PutEventsRequest request) {

        return putEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutEventsResult> putEventsAsync(final PutEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutEventsRequest, PutEventsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PutEventsResult>() {
            @Override
            public PutEventsResult call() throws Exception {
                PutEventsResult result;

                try {
                    result = putEvents(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutRuleResult> putRuleAsync(PutRuleRequest request) {

        return putRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRuleResult> putRuleAsync(final PutRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRuleRequest, PutRuleResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PutRuleResult>() {
            @Override
            public PutRuleResult call() throws Exception {
                PutRuleResult result;

                try {
                    result = putRule(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutTargetsResult> putTargetsAsync(PutTargetsRequest request) {

        return putTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutTargetsResult> putTargetsAsync(final PutTargetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutTargetsRequest, PutTargetsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PutTargetsResult>() {
            @Override
            public PutTargetsResult call() throws Exception {
                PutTargetsResult result;

                try {
                    result = putTargets(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RemoveTargetsResult> removeTargetsAsync(RemoveTargetsRequest request) {

        return removeTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTargetsResult> removeTargetsAsync(final RemoveTargetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveTargetsRequest, RemoveTargetsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RemoveTargetsResult>() {
            @Override
            public RemoveTargetsResult call() throws Exception {
                RemoveTargetsResult result;

                try {
                    result = removeTargets(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<TestEventPatternResult> testEventPatternAsync(TestEventPatternRequest request) {

        return testEventPatternAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestEventPatternResult> testEventPatternAsync(final TestEventPatternRequest request,
            final com.amazonaws.handlers.AsyncHandler<TestEventPatternRequest, TestEventPatternResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<TestEventPatternResult>() {
            @Override
            public TestEventPatternResult call() throws Exception {
                TestEventPatternResult result;

                try {
                    result = testEventPattern(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
